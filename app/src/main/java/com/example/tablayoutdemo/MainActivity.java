package com.example.tablayoutdemo;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(new myFragment(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }
    class  myFragment extends FragmentPagerAdapter{

        String[]c_name={"Bangladesh","India","Usa"};

        public myFragment(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if (i==0){
                return new Bangladesh();
            }
            else if (i==1){
                return new India();
            }
            else if (i==2){
                return new Usa();
            }
            return null;
        }

        @Override
        public int getCount() {
            return c_name.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return c_name[position];
        }
    }
}
