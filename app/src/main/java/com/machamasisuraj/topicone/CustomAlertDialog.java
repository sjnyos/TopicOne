package com.machamasisuraj.topicone;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

public class CustomAlertDialog extends Dialog implements DialogInterface.OnClickListener {

    Context c;

    public CustomAlertDialog(@NonNull Context c ) {
        super(c);
        this.c = c;
    }



    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
