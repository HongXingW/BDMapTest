package com.example.whx.bdmaptest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.baidu.mapapi.map.MapView;

/**
 * Created by whx on 2016/9/9.
 */
public class MapActivity extends AppCompatActivity{

    private MapView mapView;
    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_map);
    }
}
