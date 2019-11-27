package com.machamasisuraj.topicone;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class imageViewActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivPhoto;
    private RadioButton rdoironman, rdospiderman, rdomarvel;
    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        alertBuilder = new AlertDialog.Builder(this);
        ivPhoto = findViewById(R.id.ivPhoto);
        rdomarvel = findViewById(R.id.rdomarvel);
        rdoironman = findViewById(R.id.rdoironman);
        rdospiderman = findViewById(R.id.rdospiderman);

        rdoironman.setOnClickListener(this);
        rdospiderman.setOnClickListener(this);
        rdomarvel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rdoironman:{
                alertBox(R.drawable.ironman);
                break;
            }
            case R.id.rdospiderman:
                alertBox(R.drawable.sipderman);
                break;
            case R.id.rdomarvel:
                alertBox(R.drawable.captain);
                break;
        }

    }

    public void alertBox(final int i){

        alertBuilder.setMessage("Do you want to Load this Picture?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ivPhoto.setImageResource(i);
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        Toast.makeText(imageViewActivity.this,"you clicked no",Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.setTitle("Prompt");
        alertDialog.show();

    }


}