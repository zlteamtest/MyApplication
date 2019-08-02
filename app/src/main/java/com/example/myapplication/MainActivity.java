package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.myapplication.adapter.VpAdapter;
import com.example.myapplication.fragment.AFragment;
import com.example.myapplication.fragment.BFragment;
import com.example.myapplication.fragment.CFragment;
import com.example.myapplication.fragment.DFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mVp;
    private TabLayout mTab;
    private ArrayList<Fragment> mFragments;
    private VpAdapter mVpAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initFragment();
    }

    private void initFragment() {
        mFragments = new ArrayList<>();
        mFragments.add(new AFragment());
        mFragments.add(new BFragment());
        mFragments.add(new CFragment());
        mFragments.add(new DFragment());
        mVpAdapter = new VpAdapter(getSupportFragmentManager(), mFragments);
        mVp.setAdapter(mVpAdapter);
        mTab.setupWithViewPager(mVp);
        mTab.getTabAt(0).setText("大娃").setIcon(R.mipmap.ic_launcher);
        mTab.getTabAt(1).setText("二娃").setIcon(R.mipmap.ic_launcher);
        mTab.getTabAt(2).setText("三娃").setIcon(R.mipmap.ic_launcher);
        mTab.getTabAt(3).setText("四娃").setIcon(R.mipmap.ic_launcher);
        Toast.makeText(this, "更新了", Toast.LENGTH_SHORT).show();
    }

    private void initView() {
        mVp = findViewById(R.id.fm);
        mTab = findViewById(R.id.tab);


    }
}
