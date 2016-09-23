package com.example.jhon.fragmentseratic;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.jhon.fragmentseratic.adapters.FragmentsPagerAdapter;
import com.example.jhon.fragmentseratic.fragments.LugarTurismoFragment;
import com.example.jhon.fragmentseratic.models.Lugares;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager container;
    LugarTurismoFragment fragment;
    List<Fragment> dataFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataFragment = new ArrayList<>();
        fragment = new LugarTurismoFragment();
        Lugares lugar = new Lugares();
        lugar.setNombre("Hotel monasterio");
        lugar.setImgUrl("http://www.hotelesdann.com/dann-popayan/wp-content/uploads/sites/4/2014/02/DSC_4298-350x169.jpg");
        fragment.initFragment(lugar);

        LugarTurismoFragment fragment2 = new LugarTurismoFragment();
        Lugares lugar2 = new Lugares();
        lugar2.setNombre("El morro");
        lugar2.setImgUrl("http://www.hotelesdann.com/dann-popayan/wp-content/uploads/sites/4/2014/02/DSC_4298-350x169.jpg");
        fragment2.initFragment(lugar2);

        LugarTurismoFragment fragment3 = new LugarTurismoFragment();
        Lugares lugar3 = new Lugares();
        lugar3.setNombre("Seratic");
        lugar3.setImgUrl("http://www.hotelesdann.com/dann-popayan/wp-content/uploads/sites/4/2014/02/DSC_4298-350x169.jpg");
        fragment3.initFragment(lugar3);
        dataFragment.add(fragment);
        dataFragment.add(fragment2);
        dataFragment.add(fragment3);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Turismo");
        container = (ViewPager) findViewById(R.id.container);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        String nombre1 = "hotel1";
        String nombre2 = "hotel2";
        String nombre3 = "hotel3";
        List<String> dataString = new ArrayList<>();
        dataString.add(nombre1);
        dataString.add(nombre2);
        dataString.add(nombre3);
        FragmentsPagerAdapter adapter = new FragmentsPagerAdapter(getSupportFragmentManager(),dataFragment,dataString);
        container.setAdapter(adapter);
        tabLayout.setupWithViewPager(container);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }
}
