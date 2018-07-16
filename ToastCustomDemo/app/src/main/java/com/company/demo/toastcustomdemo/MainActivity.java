package com.company.demo.toastcustomdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showBtn = (Button) findViewById(R.id.btnId);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View customView = inflater.inflate(R.layout.customtoast_layout, (ViewGroup) findViewById(R.id.customToastId));

                Toast tost = new Toast(MainActivity.this);
                tost.setDuration(Toast.LENGTH_SHORT);
                tost.setGravity(Gravity.CENTER,0,0);
                tost.setView(customView);
                tost.show();
            }
        });

    }
}
