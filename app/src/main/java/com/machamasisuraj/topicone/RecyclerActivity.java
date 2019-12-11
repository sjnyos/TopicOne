package com.machamasisuraj.topicone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);

        List<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("Spiderman","123456798",R.drawable.sipderman));
        contacts.add(new Contacts("Captain Marvel","123456798",R.drawable.marvel));
        contacts.add(new Contacts("IromMan","123456798",R.drawable.ironman));
        contacts.add(new Contacts("Spiderman","123456798",R.drawable.sipderman));
        contacts.add(new Contacts("Captain Marvel","123456798",R.drawable.marvel));
        contacts.add(new Contacts("IromMan","123456798",R.drawable.ironman));
        contacts.add(new Contacts("Spiderman","123456798",R.drawable.sipderman));
        contacts.add(new Contacts("Captain Marvel","123456798",R.drawable.marvel));
        contacts.add(new Contacts("IromMan","123456798",R.drawable.ironman));
        contacts.add(new Contacts("Spiderman","123456798",R.drawable.sipderman));
        contacts.add(new Contacts("Captain Marvel","123456798",R.drawable.marvel));
        contacts.add(new Contacts("IromMan","123456798",R.drawable.ironman));

        ContactAdapter contactAdapter = new ContactAdapter(this, contacts);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
