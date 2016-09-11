package com.bignerdranch.android.criminalinetent;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class CrimeAvtivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_avtivity);
        //因为使用的是支持库及FragmentActivity类，所以这里调用的方法是getSupportFragmentManager()。
        //如果不考虑版本兼容性，可以直接继承Activity类并调用getFragmentManager()方法
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.Fragment fragment = fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new CrimeFragment();
            //创建一个新的fragment事务，加入一个添加操作，然后提交该事务
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }

    }
}
