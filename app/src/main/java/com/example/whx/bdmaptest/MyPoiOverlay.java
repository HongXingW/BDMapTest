package com.example.whx.bdmaptest;

import com.baidu.mapapi.map.BaiduMap;

/**
 * Created by whx on 2016/9/13.
 */
public class MyPoiOverlay extends PoiOverlay{

    /**
     * 构造函数
     *
     * @param baiduMap 该 PoiOverlay 引用的 BaiduMap 对象
     */
    public MyPoiOverlay(BaiduMap baiduMap) {
        super(baiduMap);
    }
}
