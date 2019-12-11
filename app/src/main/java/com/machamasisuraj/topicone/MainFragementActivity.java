package com.machamasisuraj.topicone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.machamasisuraj.topicone.fragements.FirstFragment;
import com.machamasisuraj.topicone.fragements.SecondFragment;

public class MainFragementActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFragement1;
    Boolean status = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragement);
        btnFragement1 = findViewById(R.id.btnFragement1);
        btnFragement1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if(status){
            FirstFragment firstFragment = new FirstFragment(this);
            fragmentTransaction.replace(R.id.fragementContainer,firstFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnFragement1.setText("Load Second Fragement");
            status=false;
        }
        else{
            SecondFragment secondFragment = new SecondFragment(this);
            fragmentTransaction.replace(R.id.fragementContainer,secondFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            btnFragement1.setText("Load First Fragement");
            status=true;
        }

    }
}
