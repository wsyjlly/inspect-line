// 地图展示页面
layui.use(['jquery','form','slider'], function(){
    var form = layui.form,
        $ = layui.jquery,
        slider = layui.slider;

    // 初始化地图
    Connection.init(true);

    //地图级别改变时发生
    Connection.map.on("zoomend", function (e) {
        var zoom_val = e.target.getZoom();
        $('.map_grade span').html(zoom_val);
    });
    
    // 工具栏
    var _map = Connection.map;
    var _layer = [];
    var clickState = true;

    // 右下角工具栏功能
    // 画点
    window.drawPointBtn = function(){
        if(clickState){
            clickState = false;
            __MAP__.DrawPoint(_map,drawLineCb)
        }
    }
    // 画线
    window.drawLineBtn = function(){
        if(clickState){
            clickState = false;
            __MAP__.DrawLine(_map,drawLineCb)
        }
    }
    // 画圆
    window.drawCircleBtn = function(){
        if(clickState){
            clickState = false;
            __MAP__.DrawCircle(_map,drawLineCb)
        }
    }
    // 画多边形
    window.drawPolygonBtn = function(){
        if(clickState){
            clickState = false;
            __MAP__.DrawPolygon(_map,drawLineCb)
        }
    }

    // 右下角工具栏标尺功能
    window.distance = function(){
        if(clickState){
            clickState = false;
            __MAP__.Measure(_map,drawLineCb)
        }
    }
    // 动态画线回调函数
    function drawLineCb(layer){
        _layer.push(layer)
        clickState = true;
    }

    window.deleteEvent = function(){
        if(_layer.length){
            _layer.forEach(function(el){
                __MAP__.layerHide(_map,el)
            })
            
            _layer.length=0;
        }
    }

    // 表单重新渲染
    form.render();

    // 设置按钮点击事件
    $('.set_btn').click(function(){
        $('.set_box .box').toggle()
    })

    // 右上角飞机模式按钮
    $('.uav_modal').click(function(){
        var state = $(this).attr('data-state');
        if(state==1){
            $(this).attr('data-state',0);
            $(this).removeClass('modal2').addClass('modal1');
            // 修改飞行模式
            Connection.uavModal = 1;
            Connection.map.setMaxZoom(23);
            Connection.mapRotate(Connection.map,0)
        }else{
            if(Connection.uavId){
                $(this).attr('data-state',1);
                $(this).removeClass('modal1').addClass('modal2');
                // 修改飞行模式
                Connection.uavModal = 2;
                Connection.map.setMaxZoom(18);
            }else{
                layer.msg('请选择无人机！')
            }
        }
    })

    // 所有基础设施显示控制
    // form.on('switch(boxSwitch)', function(data){
    //     var state = data.elem.checked;
    //     Connection.layerControl(state,Connection.resultLayer1)
    //     Connection.layerControl(state,Connection.thirdLayer)
    //     Connection.layerControl(state,Connection.throughLayer)
    //     Connection.layerControl(state,Connection.stationLayer)
    //     Connection.layerControl(state,Connection.valueLayer)
    //     // 勾选多选框
    //     state?$('.set_box .checkbox_group input[type="checkbox"]').prop("checked", true):$('.set_box .checkbox_group input[type="checkbox"]').prop("checked", false)
    //     form.render()
    // }); 

    // 勾选框绑定事件
    function baseLayerControl(cname,lname){
        form.on('checkbox('+cname+')', function(data){
            var state = data.elem.checked;
            Connection.layerControl(state,lname)
        });
    }
    // 险情位置
    baseLayerControl('danger1',Connection.untreated)    // 险情(未指派)
    baseLayerControl('danger2',Connection.dispose)      // 险情(处理中)
    baseLayerControl('danger3',Connection.finished)     // 险情(已完成)

    // 选择设施
    baseLayerControl('ckyd',Connection.throughLayer)    // 穿跨越点
    baseLayerControl('fs',Connection.valueLayer)        // 阀室
    baseLayerControl('bhz',Connection.baseStation)      // 基站
    baseLayerControl('dsfsg',Connection.thirdLayer)     // 第三方施工
    baseLayerControl('sthxq',Connection.sthxqLayer)     // 生态红线区

    // 高后果区
    baseLayerControl('ghgq1',Connection.resultLayer1)   // 等级一
    baseLayerControl('ghgq2',Connection.resultLayer2)   // 等级二
    baseLayerControl('ghgq3',Connection.resultLayer3)   // 等级三

    // 桩号   
    baseLayerControl('bzz',Connection.bjzLayer)         // 标志桩
    baseLayerControl('jmz',Connection.jmzLayer)         // 加密桩
    baseLayerControl('jsp',Connection.jszLayer)         // 警示牌
    baseLayerControl('lcz',Connection.lczLayer)         // 里程桩
    baseLayerControl('csz',Connection.cszLayer)         // 测试桩
    baseLayerControl('zjz',Connection.zjzLayer)         // 转角桩
    baseLayerControl('cybzz',Connection.cybzzLayer)     // 穿越标志桩
    baseLayerControl('glbzz',Connection.glbzzLayer)     // 光缆标志桩

    baseLayerControl('warning1',Connection.warnLayer1)  // 警戒线
    baseLayerControl('warning2',Connection.warnLayer2)  // 警戒线

    // 警戒线
    var slider1 = 0;
    let timer =null;
    slider.render({
        elem: '#warning1',
        max:20,
        min:0,
        step: 1, //步长
        tips:false,
        theme: '#A82D29',
        change: function(value){
            //do something
            if(value!=slider1){
                slider1 = value;
                $('#warning1').siblings('.input').html(value+'m');
                window.clearTimeout(timer);
                timer = setTimeout(function(){
                    // 传值给C端
                    value==0?Connection.layerControl(false,Connection.warnLayer1):jsMap.GetInLine(value)
                },800)
            }
        }
      }); 
    var slider2 = 0;
    slider.render({
        elem: '#warning2',
        min: 20,
        max:200,
        tips:false,
        theme: '#DE4B47',
        step: 1, //步长
        change: function(value){
            if(value!=slider2){
                slider2 = value;
                $('#warning2').siblings('.input').html(value+'m');
                window.clearTimeout(timer);
                timer = setTimeout(function(){
                    // 传值给C端
                    jsMap.GetOutLine(value)
                },800)
            }
        }
    });

    // 正射影像切换
    form.on('select(domImage)', function(data){
        if(data.value)changeSelectId(data.value)
    }); 

    // 根据选中的id找对应的dom数组
    window.changeSelectId = function(id){
        var list = null;
        Connection.domList.forEach(function(el){
            if(el.id==id)list = el.list;
        })
        if(list){
            var arr = []
            list.forEach(function(el){
                var url = el.url+'{z}/{x}/{y}.png'
                arr.push(url)
            })
            __MAP__.changeTileLayer(_map,arr)
        }
    }

    // 接口测试代码
    var domain = 'http://14.204.73.150:19030'

    // 高后果区
    // $.ajax({
    //     url: domain + '/api/highConsequences/pagelist',
    //     type: 'post',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"d9a62d2ef5a1446799e9393714ac28c0",
    //         "u-projectId":47
    //     },
    //     data: JSON.stringify({
    //         "pageSize":9999
    //     }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData.records;
    //          Connection.drawConsequences(data)
    //     }
    // })

    // 桩牌
    // $.ajax({
    //     url: domain + '/api/pipelinecard/pagelist',
    //     type: 'post',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"d9a62d2ef5a1446799e9393714ac28c0",
    //         "u-projectId":47
    //     },
    //     data: JSON.stringify({
    //         "pageSize":500
    //     }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData.records;
    //         Connection.drawCard(data)
    //     }
    // })

    // 基础设施
    // $.ajax({
    //     url: domain + '/api/constructionUnit/pagelist',
    //     type: 'post',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"d9a62d2ef5a1446799e9393714ac28c0",
    //         "u-projectId":47
    //     },
    //     data: JSON.stringify({
    //         "pageSize":500
    //     }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData.records;
    //          Connection.drawFacility(2,data)
    //     }
    // })
    // 基站
    // $.ajax({
    //     url: domain + '/api/station/pagelist',
    //     type: 'post',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"d9a62d2ef5a1446799e9393714ac28c0",
    //         "u-projectId":47
    //     },
    //     data: JSON.stringify({
    //         "pageSize":500
    //     }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData.records;
    //          Connection.drawBaseStation(data)
    //     }
    // })
    // 200米警戒线
    // $.ajax({
    //     url: domain + '/api/pipelinePoint/buffer/200',
    //     type: 'get',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"d9a62d2ef5a1446799e9393714ac28c0",
    //         "u-projectId":47
    //     },
    //     // data: JSON.stringify({
    //     //     "pageSize":500
    //     // }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData;
    //          Connection.drawPicketLine(data,1)
    //     }
    // })
    // 50米警戒线
    // $.ajax({
    //     url: domain + '/api/pipelinePoint/buffer/50',
    //     type: 'get',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"d9a62d2ef5a1446799e9393714ac28c0",
    //         "u-projectId":47
    //     },
    //     // data: JSON.stringify({
    //     //     "pageSize":500
    //     // }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData;
    //          Connection.drawPicketLine(data,0)
    //     }
    // })

    // 险情
    // $.ajax({
    //     url: domain + '/api/danger/list',
    //     type: 'post',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"d9a62d2ef5a1446799e9393714ac28c0",
    //         "u-projectId":47
    //     },
    //     data: JSON.stringify({
    //         "pageSize":500
    //     }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData.records;
    //          Connection.drawDanger(data)
    //     }
    // })

    // 正射影像
    // $.ajax({
    //     url: domain + '/api/domImage/list/vo',
    //     type: 'get',
    //     dataType: 'json',
    //     contentType: "application/json",
    //     headers: {
    //         "u-uid":7,
    //         "u-token":"548b2222c5bb4ec78b0046e00767308a",
    //         "u-projectId":47
    //     },
    //     // data: JSON.stringify({
    //     //     "pageSize":500
    //     // }),
    //     success: function (res) {
    //         console.log(res)
    //         var data = res.returnData;

    //         Connection.setDomImage(data)
             
    //     }
    // })

    // 添加点测试
    // var data1 = {
    //     id:'1',
    //     lng: 118.9317469,
    //     lat: 32.15876697
    // }
    // var data2 = {
    //     id:'2',
    //     lng: 118.9369767,
    //     lat: 32.15458272
    //}
    //Connection.drawUav(data1)
    // Connection.drawUav(data2)

});