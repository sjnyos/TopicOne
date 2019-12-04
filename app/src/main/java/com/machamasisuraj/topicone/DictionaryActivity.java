package com.machamasisuraj.topicone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryActivity extends AppCompatActivity {

    public static final String countries[] ={
            "Nepal","Kathmandu",
            "UK","London",
            "USA","Washington DC",
            "China","Beijing"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        ListView lstView = findViewById(R.id.lst_items);

        final HashMap<String,String> capitalcities = new HashMap<>();
        for(int i=0; i<countries.length;i+=2){
            capitalcities.put(countries[i],countries[i+1]);
        }

        ArrayAdapter countryAdapter =  new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,new ArrayList<String>(capitalcities.keySet()));
        lstView.setAdapter(countryAdapter);

        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String countryName = parent.getItemAtPosition(position).toString();
                String capitalName = capitalcities.get(countryName);
                Toast.makeText(getApplicationContext(),capitalName,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
