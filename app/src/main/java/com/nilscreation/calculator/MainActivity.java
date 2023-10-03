package com.nilscreation.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onBackPressed() {
        exitDialog();
    }

    private void exitDialog() {
        AlertDialog.Builder exit = new AlertDialog.Builder(MainActivity.this);
        exit.setTitle("Exit");
        exit.setMessage("Do you really want to Exit?");
        exit.setIcon(R.drawable.logo);
        exit.setCancelable(false);

        exit.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        exit.show();
    }
}