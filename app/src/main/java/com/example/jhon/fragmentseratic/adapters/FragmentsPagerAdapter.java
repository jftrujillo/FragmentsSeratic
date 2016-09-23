package com.example.jhon.fragmentseratic.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.jhon.fragmentseratic.fragments.LugarTurismoFragment;

import java.util.List;
import java.util.logging.StreamHandler;

/**
 * Created by jhon on 21/09/16.
 */
public class FragmentsPagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> data;
    List<String> nombres;


    public FragmentsPagerAdapter(FragmentManager fm, List<Fragment> data, List<String> nombres) {
        super(fm);
        this.data = data;
        this.nombres = nombres;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return nombres.get(position);
    }
}
