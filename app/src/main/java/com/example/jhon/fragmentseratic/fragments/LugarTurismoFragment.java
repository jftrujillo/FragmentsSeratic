package com.example.jhon.fragmentseratic.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jhon.fragmentseratic.MainActivity;
import com.example.jhon.fragmentseratic.R;
import com.example.jhon.fragmentseratic.models.Lugares;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class LugarTurismoFragment extends Fragment {
    Lugares lugar;

    public LugarTurismoFragment() {
        // Required empty public constructor
    }

    public void initFragment(Lugares lugar){
        this.lugar = lugar;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_lugar_turismo,container,false);
        TextView nombre = (TextView) v.findViewById(R.id.nombre);
        ImageView img = (ImageView) v.findViewById(R.id.img);
        nombre.setText(lugar.getNombre());
        Picasso.with(getContext()).load(lugar.getImgUrl()).into(img);
        return v;
    }

}
