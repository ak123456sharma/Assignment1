package com.example.akashhp.create;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.PopupMenu;
import android.widget.Toast;

import static android.view.Gravity.*;

public class Tcreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Toast toast = Toast.makeText(Tcreate.this,"ON CREATE()", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }
    }

