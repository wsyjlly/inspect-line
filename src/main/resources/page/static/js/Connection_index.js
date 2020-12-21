/**
 *  展示页面
 */
window.Connection = {
    map: null,
    resultLayer1: [],           //  高后果区1
    resultLayer2: [],           //  高后果区2
    resultLayer3: [],           //  高后果区3
    thirdLayer:   [],           //  第三方施工
    throughLayer: [],           //  穿跨越点
    stationLayer: [],           //  场站/保护站
    valueLayer:   [],           //  阀室
    sthxqLayer:   [],           //  生态红线区
    untreated:    [],           //  未指派
    dispose:      [],           //  处理中
    finished:     [],           //  已完成
    uavLayer:     [],           //  飞机列表
    baseStation:  [],           //  基站
    bjzLayer:     [],           //  标志桩
    jmzLayer:     [],           //  加密桩
    jszLayer:     [],           //  警示桩
    lczLayer:     [],           //  里程桩
    cszLayer:     [],           //  测试桩
    zjzLayer:     [],           //  转角桩
    cybzzLayer:   [],           //  穿越标志桩
    glbzzLayer:   [],           //  光缆标志桩
    warnLayer1:   [],           //  50米警戒线
    warnLayer2:   [],           //  200米警戒线
    dangerColor1: "#DBB312",    //  高后果区等级一颜色
    dangerColor2: "#E94200",    //  高后果区等级二颜色
    dangerColor3: "#920602",    //  高后果区等级三颜色
    warnColor1:   '#e4093c',    //  50米颜色
    warnColor2:   '#FF4040',    //  200米颜色
    domList: [],                //  正射影像列表
    historyLineLayer: null,     //  历史航迹
    // 飞机icon
    uavIcon: L.icon({
        iconUrl: 'static/images/map/uavIcon.png',
        iconSize: [30, 30],
        iconAnchor: [15, 15],
        popupAnchor: [-9, -10]
    }),
    uavId: null,                //  飞机id
    uavModal: 1,                //  无人机飞行模式
    // 管线样式
    lineStyle:{
        latlngs: [],
        color:"#FFFF00",
        fillColor:"#FFFF00",
        weight:4,
        opacity:0.8,
        fillOpacity:0.4
    },
    // 高后果区样式
    polygonStyle:{
        latlngs: [],
        color: this.dangerColor1,
        fillColor: this.dangerColor1,
        weight:1,
        strokeOpacity:0.8,
        fillOpacity:0.4
    },
    // 基站扇形1
    fanshaped1: {
        latlngs: [],
        color: '#42F731',
        fillColor: '#42F731',
        weight:1,
        strokeOpacity:0.8,
        fillOpacity:0.4
    },
    // 基站扇形2
    fanshaped2: {
        latlngs: [],
        color: '#13c2f7',
        fillColor: '#13c2f7',
        weight:1,
        strokeOpacity:0.8,
        fillOpacity:0.4
    },
    domain:'http://14.204.73.149',   // ip地址
    /**
     * 初始化地图
     */
    init: function(state){
        // 初始化地图
        this.map = __MAP__.init(state);
	    this.setMapCenter(31.55093,112.27092);
    },
    /**
     * 地图加载完成C端调用方法
     */
    loaded: function(){
        //  加载完成通知C端 调用C端方法
        jsMap.Loaded();
    },
    /**
     * 定位地图中心点
     */
    setMapCenter: function(lat,lng){
        if(this.marker==null && lat!=null)__MAP__.setMapCenter(this.map,[lat,lng])
    },
    /**
     * 画险情
     * @param {*} data
     */
    drawDanger: function(data){
        var _this = this;
        // 保存险情
        var dangerLayer = [];
        var markerIcon = null;
        // 遍历数据绘制险情
        data&&data.forEach(function(el){
            var reg = /^https?/ig;
            var url1 = reg.test(el.levelIcon);
            var url2 = reg.test(el.levelIconClick);
            var icon1 = url1==true?el.levelIcon:_this.domain+el.levelIcon
            var icon2 = url2==true?el.levelIconClick:_this.domain+el.levelIconClick
            //  高后果区icon
            var _icon = L.icon({
                iconUrl: icon1,
                iconSize: [30, 30],
                iconAnchor: [17, 10],
                popupAnchor: [0, -30]
            })
            //  高后果区选中icon
            var _icon1 = L.icon({
                iconUrl: icon2,
                iconSize: [30, 30],
                iconAnchor: [17, 10],
                popupAnchor: [0, -30]
            })
            markerIcon = _icon1
            // icon参数
            var options = {
                id: el.id,
                lat: el.lat,
                lng: el.lng,
                markerIcon: _icon,
                obj: el
            }
            // 自定义属性  险情点击状态切换
            options.obj.icon1 = _icon
            options.obj.icon2 = _icon1
            options.obj.state = 0
            // 画点并保存
            switch(el.status){
                case 0:
                    var marker = __MAP__.addPoint(_this.map,options)
                    _this.untreated.push(marker);
                    dangerLayer.push(marker)
                    break;
                case 1:
                    var marker = __MAP__.addPoint(_this.map,options)
                    _this.dispose.push(marker);
                    dangerLayer.push(marker)
                    break;
                case 2:
                    var marker = __MAP__.addPoint(_this.map,options)
                    _this.finished.push(marker);
                    dangerLayer.push(marker)
                    break;
            }
        });
        // 遍历险情icon绑定事件
        dangerLayer.forEach(function(el){
            // 点击修改icon状态
            el.on('click',function(){
                // 获取icon属性（点击状态和切换icon）
                var state = this.options.obj.state;
                var icon1 = this.options.obj.icon1;
                var icon2 = this.options.obj.icon2;
                if(state){
                    this.setIcon(icon1)
                    this.options.obj.state = 0
                }else{
                    dangerLayer.forEach(function(el){
                        el.options.obj.state = 0
                        el.setIcon(el.options.obj.icon1)
                    })
                    this.setIcon(icon2)
                    this.options.obj.state = 1
                }
                // 将id传C端
                jsMap.SelectedId(el.options.id)
            })
        })
        // 隐藏图层
        this.layerControl(false,this.untreated);
        this.layerControl(false,this.dispose);
        this.layerControl(false,this.finished);
    },
    /**
     * 根据C端传id居中险情位置
     */
    dangerSearch:function(id){
        var _this = this;
        if(id){
            // 合并所有险情
            var arr = this.untreated.concat(this.dispose).concat(this.finished);
            // 遍历所有险情
            arr.forEach(function(el){
                if(el.options.id==id){
                    // 修改icon状态
                    arr.forEach(function(e){
                        e.options.obj.state = 0;
                        e.setIcon(el.options.obj.icon1);
                    })
                    el.setIcon(el.options.obj.icon2);
                    el.options.obj.state = 1;
                    // 显示图层
                    __MAP__.layerShow(_this.map,el)
                    // icon居中
                    __MAP__.setMapCenter(_this.map,el.getLatLng());
                }
            });
        }
    },
    /**
     * 画基础设施
     * @param {*} type 1.高后果区 2.第三方施工 3.穿跨越点 4.场站/保护站 5.阀室
     * @param {*} data 服务端返回数据list
     */
    drawFacility: function(type,data){
        var _this = this;

        data&&data.forEach(function(el){
            //  高后果区icon
            var _icon = L.icon({
                iconUrl: _this.domain+el.icon,
                iconSize: [30, 30],
                iconAnchor: [17, 10],
                popupAnchor: [0, -30]
            })
            // icon参数
            var options = {
                id: el.id,
                lat: el.lat,
                lng: el.lng,
                markerIcon: _icon,
                obj: el
            }
            // 绘制marker
            var marker = __MAP__.addPoint(_this.map,options)
            // 绑定弹框
            _this.baseTooltip(marker,el)
            // 画点并保存
            switch(type){
                case 1:
                    // if(el.level==1){
                    //     _this.resultLayer1.push(marker);
                    // }
                    // if(el.level==2){
                    //     _this.resultLayer2.push(marker);
                    // }
                    // if(el.level==3){
                    //     _this.resultLayer3.push(marker);
                    // }
                    break;
                case 2:
                    _this.thirdLayer.push(marker);
                    break;
                case 3:
                    _this.throughLayer.push(marker);
                    break;
                case 4:
                    _this.stationLayer.push(marker);
                    break;
                case 5:
                    _this.valueLayer.push(marker);
                    break;
            }
        })
        // 隐藏图层
        this.layerControl(false,this.thirdLayer)
        this.layerControl(false,this.throughLayer)
        this.layerControl(false,this.stationLayer)
        this.layerControl(false,this.valueLayer)
    },
    /**
     * 画桩牌
     * @param {*} data
     */
    drawCard: function(data){
        var _this = this;
        // 遍历数据
        data&&data.forEach(function(el){
            //  桩牌icon
            var _icon = L.icon({
                iconUrl: _this.domain+el.icon,
                iconSize: [10, 10],
                iconAnchor: [6, 10],
                popupAnchor: [0, 0]
            })
            // icon参数
            var options = {
                id: el.id,
                lat: el.lat,
                lng: el.lng,
                markerIcon: _icon,
                obj: el
            }
            // 画点绑定弹框
            var marker = __MAP__.addPoint(_this.map,options)
            _this.stakeTooltip(marker,el)
            // 绘制桩牌
            switch(el.cardType){
                case 301:
                    _this.bjzLayer.push(marker);
                    break;
                case 302:
                    _this.cybzzLayer.push(marker);
                    break;
                case 303:
                    _this.glbzzLayer.push(marker);
                    break;
                case 304:
                    _this.jmzLayer.push(marker);
                    break;
                case 305:
                    _this.jszLayer.push(marker);
                    break;
                case 306:
                    _this.lczLayer.push(marker);
                    break;
                case 307:
                    _this.cszLayer.push(marker);
                    break;
                case 308:
                    _this.cszLayer.push(marker);
                    break;
                case 309:
                    _this.zjzLayer.push(marker);
                    break;
                case 310:
                    _this.zjzLayer.push(marker);
                    break;
            }
        })
        // 隐藏图层
        this.layerControl(false,this.bjzLayer)
        this.layerControl(false,this.cybzzLayer)
        this.layerControl(false,this.glbzzLayer)
        this.layerControl(false,this.jmzLayer)
        this.layerControl(false,this.jszLayer)
        this.layerControl(false,this.lczLayer)
        this.layerControl(false,this.cszLayer)
        this.layerControl(false,this.zjzLayer)
    },
    /**
     * 画基站（扇形）
     * @param {*} data
     */
    drawBaseStation: function(data){
        var _this = this;
        //  高后果区icon
        var _icon = L.icon({
            iconUrl: '',
            iconSize: [30, 30],
            iconAnchor: [17, 10],
            popupAnchor: [0, -30]
        });
        data&&data.forEach(function(el){
            // 画基站icon
            _icon.options.iconUrl = _this.domain+el.icon;
            var options = {
                id: el.id,
                lat: el.lat,
                lng: el.lng,
                markerIcon: _icon
            }
            var marker = __MAP__.addPoint(_this.map,options);
            _this.baseStation.push(marker);

            // 获取扇形数据
            var data1 = __MAP__.getFanshapedData(el.lng, el.lat, el.radius, el.azimuth1, el.pitch1);
            var data2 = __MAP__.getFanshapedData(el.lng, el.lat, el.radius, el.azimuth2, el.pitch2);
            var latlngs1 = [], latlngs2 = [];
            data1.forEach(function(item){
                latlngs1.push([item.lat,item.lng])
            })
            data2.forEach(function(item){
                latlngs2.push([item.lat,item.lng])
            })
            // 画扇形
            var options1 = _this.fanshaped1;
            var options2 = _this.fanshaped2;
            options1.latlngs = latlngs1;
            options2.latlngs = latlngs2;
            var f1 = __MAP__.addPolygon(_this.map,options1);
            var f2 = __MAP__.addPolygon(_this.map,options2);
            _this.baseStation.push(f1)
            _this.baseStation.push(f2)
        })
        // 隐藏图层
        this.layerControl(false,this.baseStation)
    },
    /**
     * 画管线
     */
    addLine: function(data){

        var line = [];
        // 数据处理
        data&&data.forEach(function(e){
            line.push([e.lat,e.lng])
        });
        if(line.length){
            // 地图画线
            this.lineStyle.latlngs = line;
            this.lineLayer = __MAP__.addLine(this.map,this.lineStyle);
        }
    },
    /**
     * 绘制管线
     * @param {*} data
     * @param {*} color
     */
    addHistoryLine: function(data,color){
        if(this.historyLineLayer){
            __MAP__.layerHide(this.map,this.historyLineLayer);
        }
        var lineStyle = {
            latlngs: [],
            color: color,
            fillColor: color,
            weight:4,
            opacity:0.8,
            fillOpacity:0.4
        }
        data && data.forEach(function(e){
            lineStyle.latlngs.push([e.Lat,e.Lng]);
        });
        if(lineStyle.latlngs.length){
            this.historyLineLayer = __MAP__.addLine(this.map,lineStyle);
        }
    },
    /**
     * 画飞机
     * @param data
     * {
     *  id：飞机id,
     *  lat:39,
     *  lng:119,
     *  angle:飞机角度， icon旋转角度
     *  uavName：无人机名称，
     *  speed：速度，
     *  height：高度，
     *  pitch：俯仰角，
     *  yaw：航向角
     * }
     */
    drawUav: function(data){
        var _this = this;
        // yaw取绝对值
        data.yaw = Math.abs(data.yaw);
        // 飞机id集合
        var uavId = [];
        // 飞机icon
        var uavIcon = this.uavIcon;
        // 本地已存在飞机list
        var uavList = this.uavLayer;
        // 遍历所有飞机id
        uavList.forEach(function(el){
            uavId.push(el.options.id);
        })
        // 飞机标牌
        var htmlstr = '<div>'+
                        '<div class="row"><div>无人机名称：'+data.uavName+'</div></div>'+
                        '<div class="row"><div>飞行速度：'+data.speed+'</div></div>'+
                        '<div class="row"><div>飞行高度：'+data.height+'</div></div>'+
                        '<div class="row"><div>俯仰角：'+data.pitch+'</div></div>'+
                        '<div class="row"><div>航向角：'+data.yaw+'</div></div>'+
                    '</div>'
        // 实时跟随飞机 旋转地图
        if(this.uavId==data.id && this.uavModal==2){
            var angle = parseInt(-data.yaw)
            this.mapRotate(this.map,angle)
            __MAP__.setMapCenter(this.map,[data.lat,data.lng])
        }
        // 查询飞机是否存在
        if(uavId.indexOf(data.id)>-1){
            uavList.forEach(function(el){
                if(el.options.id==data.id){
                    el.setLatLng([data.lat,data.lng]);
                    // 判断飞行模式
                    if(_this.uavModal==1){
                        el.options.rotationAngle = data.angle;
                    }else{
                        el.options.rotationAngle = 0;
                    }
                    // 绑定标牌信息
                    el._popup.setContent(htmlstr);
                }
            })
        }else{
            // 绘制飞机
            var uav = L.marker([data.lat,data.lng], {
                id: data.id,
                type:'point',
                icon: uavIcon,
                rotationAngle: data.angle,
                draggable: false
            }).addTo(this.map);
            // 绑定标牌信息
            uav.bindPopup(htmlstr,{
                minWidth: 100,
                maxWidth: 150,
                offset:[10,-8],
                closeButton: false,
                autoClose: false,
                closeOnEscapeKey: false,
                autoPan: false,
                className: 'uav_panel'
            }).openPopup();
            // 绑定点击事件
            uav.on('click',function(event){
                // 记录当前飞机id
                _this.uavId = this.options.id;
                // 将飞机id 传C端
                jsMap.SelectedUav(data.id)
            })
            // 保存飞机
            uavList.push(uav);
        }
    },
    /**
     * 删除飞机
     * @param {*} data
     */
    removeUav: function(id){
        var _this = this;
        this.uavLayer&&this.uavLayer.forEach(function(el,index){
            if(el.options.id == id){
                __MAP__.layerHide(_this.map,el)
                _this.uavLayer.splice(index,1)
            }
        })
    },
    /**
     * 绘制高后果区（画多边形）
     * data：高后果区数据
     */
    drawConsequences: function(data){
        var _this = this;
        // 如果有数据  绘制后果区
        data&&data.forEach(function(el){
            // 获取多边形经纬度数据
            var latlngs = [];

            if(el.bufferPoints){
                var _arr = JSON.parse(el.bufferPoints);
                // 处理多边形数据
                _arr.forEach(function(item){
                    latlngs.push([item.lat,item.lng])
                })
                _this.polygonStyle.latlngs = latlngs;
                // 高后果区根据等级区分颜色  并绘制多边形
                if(el.level==1){
                    _this.polygonStyle.color=_this.dangerColor1;
                    _this.polygonStyle.fillColor=_this.dangerColor1;
                    _this.resultLayer1.push(__MAP__.addPolygon(_this.map,_this.polygonStyle))
                }
                if(el.level==2){
                    _this.polygonStyle.color=_this.dangerColor2;
                    _this.polygonStyle.fillColor=_this.dangerColor2;
                    _this.resultLayer2.push(__MAP__.addPolygon(_this.map,_this.polygonStyle))
                }
                if(el.level==3){
                    _this.polygonStyle.color=_this.dangerColor3;
                    _this.polygonStyle.fillColor=_this.dangerColor3;
                    _this.resultLayer3.push(__MAP__.addPolygon(_this.map,_this.polygonStyle))
                }
            }
        });
        // 隐藏图层
        this.layerControl(false,this.resultLayer1)
        this.layerControl(false,this.resultLayer2)
        this.layerControl(false,this.resultLayer3)
    },
    /**
     * 绘制警戒线
     * @param {*} data
     * @param {*} type  0:50米  1:200米
     */
    drawPicketLine: function(data,type){
        var latlngs = [];
        var _this = this
        data&&data.forEach(function(el){
            latlngs.push([el.lat,el.lng])
        })
        _this.lineStyle.latlngs = latlngs;
        // 修改多边形颜色
        if(type==0){
            // 隐藏图层
            if(this.warnLayer1){
                this.layerControl(false,this.warnLayer1);
                this.warnLayer1.length = 0;
            }
            this.lineStyle.color=this.warnColor1;
            this.lineStyle.fillColor=this.warnColor1;
            this.warnLayer1.push(__MAP__.addLine(this.map,this.lineStyle))

        }else{
            if(this.warnLayer2){
                this.layerControl(false,this.warnLayer2)
                this.warnLayer2.length = 0;
            }
            this.lineStyle.color=this.warnColor2;
            this.lineStyle.fillColor=this.warnColor2;
            this.warnLayer2.push(__MAP__.addLine(this.map,this.lineStyle))
        }
    },
    /**
     * 正射影像地址获取
     * @param {*} data
     */
    setDomImage: function(data){
        var _this = this;
        var dom = document.getElementById('selectDom')
        data.forEach(function (item) {
            // 保存数据
            _this.domList.push(item);
            // 下拉菜单里添加元素
            dom.appendChild(new Option(item.name, item.id));
        });
        layui.form.render()
        // 1s后加载默认正射影像
        changeSelectId(3)
    },
    /**
     * 地图旋转
     * @param {*} map
     * @param {*} angle
     */
    mapRotate: function(map,angle){
        map.setBearing(angle);
    },
    /**
     * marker绑定弹出框  基础设施
     * @param {*} state
     * @param {*} layer
     */
    baseTooltip: function(layer,data) {
        var html = '<div>'+
                        '<div class="row"><div>设施名称：'+data.name+'</div></div>'+
                        '<div class="row"><div>现场照片</div></div>'+
                        '<div class="row"><div class="img_box"><img src="'+this.domain+data.image+'"/></div></div>'+
                    '</div>'
        __MAP__.bindToolTip(layer,html,'div')
    },
    /**
     * marker绑定弹出框  桩牌弹框
     * @param {*} state
     * @param {*} layer
     */
    stakeTooltip: function(layer,data) {
        var html = '';
        if(data.image){
            html = '<div>'+
                        '<div class="row"><div>现场桩号：'+data.realPipeNo+'</div></div>'+
                        '<div class="row"><div>现场照片</div></div>'+
                        '<div class="row"><div class="img_box"><img src="'+this.domain+data.image+'"/></div></div>'+
                    '</div>'
        }else{
            html = '<div>'+
                        '<div class="row"><div>现场桩号：'+data.realPipeNo+'</div></div>'+
                    '</div>'
        }
        __MAP__.bindToolTip(layer,html,'div')
    },
    /**
     * 控制图层显示隐藏
     */
    layerControl: function(state,layer){
        var _this = this
        layer.forEach(function(item){
            state?__MAP__.layerShow(_this.map,item):__MAP__.layerHide(_this.map,item);
        })
    },
    /**
     * 清空地图icon(画点)
     */
    clearMarker: function(layers){
        var _this = this;
        layers.forEach(function(item){
            __MAP__.layerHide(_this.map,item);
        })
        layers.length = 0;
    }
}
