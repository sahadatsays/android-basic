package com.company.demo.alertdialogdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AlertDialog.Builder alertDialogBuilder;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        //for set title
        alertDialogBuilder.setTitle(R.string.alertTitle);

        //set icon
        alertDialogBuilder.setIcon(R.drawable.question);

        //for set message
        alertDialogBuilder.setMessage(R.string.message);

        //for cancelable featured
        alertDialogBuilder.setCancelable(false);

        //for set negetive button
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Clicked No Button", Toast.LENGTH_SHORT).show();
            }
        });

        // for positive button
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        //for neutral button

        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });


        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }
}
