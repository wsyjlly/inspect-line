/**
 *  添加页面
 *  画点      给C端传经纬度   接收C端经纬度
 *  画后果区  显示点 绑定点击事件 把经纬度或者id传给C端
 */
window.Connection = {
    map: null,
    marker: null,           //  点击画点marker对象
    lineLayer: null,        //  管线对象
    pointLayer:[],          //  管线上所有点的对象数据
    polygon: null,          //  高后果区对象
    //  点击画点使用的icon
    icon: L.icon({   
        iconUrl: 'static/images/map/marker-icon.png',
        iconSize: [25, 40],
        iconAnchor: [12.5, 40],
        popupAnchor: [0, -13]
    }),
    // 显示管线上的点的icon
    greenIcon: L.icon({ 
        iconUrl: 'static/images/map/blue.png',
        iconSize: [16, 16],
        iconAnchor: [8, 8],
        popupAnchor: [8, 8]
    }),
    // 选中管线上的点的icon
    redIcon: L.icon({   
        iconUrl: 'static/images/map/red.png',
        iconSize: [16, 16],
        iconAnchor: [8, 8],
        popupAnchor: [8, 8] 
    }),
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
        color:"#ed6565",
        fillColor:"#ed6565",
        weight:1, 
        strokeOpacity:0.8,
        fillOpacity:0.4
    },
    /**
     *  地图初始化方法
     */
    init: function(state){
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
     * 重置方法
     */
    reload: function(){
        var _this = this;
        var point = this.pointLayer;
        // 隐藏添加的基础设施
        this.marker&&__MAP__.layerHide(this.map,this.marker);
        // 隐藏高后果区
        this.polygon&&__MAP__.layerHide(this.map,this.polygon);
        // 隐藏所有标牌marker
        point.length&&point.forEach(function(el){
            __MAP__.layerHide(_this.map,el)
        })
        // 解除地图绑定事件
        this.mapEventOff()
    },
    /**
     * 添加点  按钮  显示/隐藏
     *  state   false隐藏  true显示
     */
    btnDomState: function(state){
        var btnDom = document.getElementById('addPoint');
        state?btnDom.style.display='block':btnDom.style.display='none';
    },
    /**
     * 地图画点（地图绑定点击画点方法）
     */
    drawMarker: function(){
        var _this = this;
        this.map.on('click', function(e){
            var options = {
                lat: e.latlng.lat,
                lng: e.latlng.lng,
                markerIcon: _this.icon
            }
            _this.marker?_this.marker.setLatLng([options.lat,options.lng]):_this.marker = __MAP__.addPoint(_this.map,options);
            // 将坐标传C端
            jsMap.AddPoint(options.lat,options.lng)
            
        })
    },
    /**
     * 移除地图绑定事件
     */
    mapEventOff: function(){
        this.map.off('click')
    },
    /**
     * 地图添加点（传经纬显示坐标位置）
     */
    addMarker: function(lat,lng){
        var options = {
            lat: lat,
            lng: lng,
            markerIcon: this.icon
        }
        // 判断画点对象是否存在  存在即修改位置  不存在创建
        this.marker?this.marker.setLatLng([options.lat,options.lng]):this.marker = __MAP__.addPoint(this.map,options);
    },
    /**
     * 清空地图icon(基础设施点)
     */
    clearMarker: function(){
        __MAP__.layerHide(this.map,this.marker);
        this.marker = null;
    },
    /**
     * 地图画线方法
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
     * 绘制所有桩牌  (画缓冲区使用)
     */
    showLineMarker: function(data){
        var _this = this;
        var point = this.pointLayer;
        if(point.length){
            point.forEach(function(el){
                __MAP__.layerShow(_this.map,el);
            });
        }else{
            // 遍历数据显示桩牌
            data&&data.forEach(function(e){
                var options = {
                    id: e.id,
                    lat: e.lat,
                    lng: e.lng,
                    markerIcon: _this.greenIcon,
                    obj:{
                        state:false
                    }
                }
                // 画点
                var marker = __MAP__.addPoint(_this.map,options);
                // 绑定点击事件
                marker.on('click',function(e){
                    // icon状态
                    var state = this.options.obj.state;
                    // 修改icon状态
                    state?this.setIcon(_this.greenIcon):this.setIcon(_this.redIcon);
                    this.options.obj.state = !this.options.obj.state;
                    // 当前marker经纬度
                    var latlng = this.getLatLng();
                    // 将坐标数据传C端
                    jsMap.AddBuffer(latlng.lat,latlng.lng)
                })
                _this.pointLayer.push(marker)
            });
        }
    },
    /**
     * 隐藏桩牌方法
     */
    hideLineMarker: function(){
        var _this = this;
        var point = this.pointLayer;
        point.forEach(function(el){
            __MAP__.layerHide(_this.map,el)
        })
    },
    /**
     * 居中桩牌
     */
    setMarkerCenter: function(id){
        var _this = this;
        id&&this.pointLayer.forEach(function(el){
            if(el.options.id==id){
                //  marker居中
                __MAP__.setMapCenter(_this.map,el.getLatLng())
                // 修改icon
                el.setIcon(_this.redIcon)
                // 修改icon状态
                el.options.obj.state = !el.options.obj.state;
            }
        })
    },
    /**
     * 绘制缓冲区（画多边形）
     * data 多边形坐标点
     * color 多边形颜色
     */
    drawBuffer: function(data,color){
        // 如果存在高后果区 先删除
        if(this.polygon){
            __MAP__.layerHide(this.map,this.polygon)
            this.polygon = null;
        }
        // 如果有数据  绘制后果区
        if(data.length){
            this.polygonStyle.latlngs = data;
            if(color){
                this.polygonStyle.color=color;
                this.polygonStyle.fillColor=color;
            }
            this.polygon = __MAP__.addPolygon(this.map,this.polygonStyle)
        }
    },
    /**
     * 显示/隐藏缓冲区  
     * state  true显示 false隐藏
     */
    bufferViewState: function(state){
        state?__MAP__.layerShow(this.map,this.polygon):__MAP__.layerHide(this.map,this.polygon);
    }
}

