/**
 *  添加页面
 *  画点      给C端传经纬度   接收C端经纬度
 *  画后果区  显示点 绑定点击事件 把经纬度或者id传给C端
 */
window.Connection = {
	map: null,
	marker: null,    //  中心点icon
	icon: L.icon({   //  点击画点使用的icon
		iconUrl: 'static/images/map/marker-icon.png',
		iconSize: [25, 40],
		iconAnchor: [12.5, 40],
		popupAnchor: [0, -13]
	}),
	/**
	 *  地图初始化方法
	 */
	init: function () {
		this.map = __MAP__.init();
		this.setMapCenter(31.55093,112.27092);
	},
	/**
	 * 地图加载完成C端调用方法
	 */
	loaded: function () {
		jsMap.Loaded();     //  加载完成通知C端 调用C端方法
	},
	/**
	 * 重置方法
	 */
	reload: function () {
		if (this.marker) {
			__MAP__.layerHide(this.map, this.marker)
			this.marker = null;
		}
	},
	/**
	 * 定位地图中心点
	 */
	setMapCenter: function (lat, lng) {
		if (this.marker == null && lat != null) {
			// 设置中心点
			__MAP__.setMapCenter(this.map, [lat, lng])
			// 画点
			var options = {
				lat: lat,
				lng: lng,
				markerIcon: this.icon
			}
			this.marker = __MAP__.addPoint(this.map, options)
		} else {
			this.marker.setLatLng([lat, lng]);
		}
	},
}

