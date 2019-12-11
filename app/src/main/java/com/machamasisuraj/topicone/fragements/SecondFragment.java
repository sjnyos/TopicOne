package com.machamasisuraj.topicone.fragements;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.machamasisuraj.topicone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    EditText et_Radius;
    Button btn_areaofCircle;
    Context mContext;
    public SecondFragment(Context mContext) {
    mContext = this.mContext;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);
        et_Radius = view.findViewById(R.id.et_Radius);
        btn_areaofCircle = view.findViewById(R.id.btn_areaofCircle);

        btn_areaofCircle.setOnClickListener(this);
        return  view;

    }

    @Override
    public void onClick(View v) {

    }
}
