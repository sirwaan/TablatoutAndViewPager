package com.sirwansoft.tablayoutandviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //todo >>>> we changed actionBar to NOActionBAr in @style
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewPager);

  ViewPagerAdapterTab adapter = new ViewPagerAdapterTab(getSupportFragmentManager()); //in activity we use this code
 // ViewPagerAdapterTab adapter = new ViewPagerAdapterTab(getChildFragmentManager()); //>>in fragment we use this code

        // this is Tab Fragments
        adapter.AddFragment(new FragmentTab1(),"One");
        adapter.AddFragment(new FragmentTab2(),"Two");
        adapter.AddFragment(new FragmentTab3(),"Three");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
