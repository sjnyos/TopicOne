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
public class FirstFragment extends Fragment  implements  View.OnClickListener{

    EditText et_firstnumber,et_Secondnumber;
    Button btnCalculate;
    Context mContext;

    public FirstFragment(Context mContext) {
       mContext = this.mContext;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_first, container, false);
       et_firstnumber = view.findViewById(R.id.et_firstnumber);
       et_Secondnumber=view.findViewById(R.id.et_Secondnumber);
       btnCalculate = view.findViewById(R.id.btnCalculate);

       btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
