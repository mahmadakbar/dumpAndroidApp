package com.trimindi.mahmadakbar.wise;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.schibsted.spain.parallaxlayerlayout.ParallaxLayerLayout;
import com.schibsted.spain.parallaxlayerlayout.SensorTranslationUpdater;

public class StartActivity extends AppCompatActivity {

    private ViewPager mViewPagerStart;
    private StartSectionsPagerAdapter mStartSectionsPagerAdapter;
    private TabLayout mTabLayoutStart;

    private ImageView mBottom_bg;
    private ImageView mMain_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mViewPagerStart = findViewById(R.id.start_tabPager);
        mStartSectionsPagerAdapter = new StartSectionsPagerAdapter(getSupportFragmentManager());
        mViewPagerStart.setAdapter(mStartSectionsPagerAdapter);

        mTabLayoutStart = findViewById(R.id.start_tabs);
        mTabLayoutStart.setupWithViewPager(mViewPagerStart, true);

        mBottom_bg = findViewById(R.id.bottom_bg);
        mMain_logo = findViewById(R.id.main_logo);
        mBottom_bg.bringToFront();
        mMain_logo.bringToFront();

    }

}
