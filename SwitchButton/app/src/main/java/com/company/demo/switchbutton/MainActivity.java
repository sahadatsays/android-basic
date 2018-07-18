package com.company.demo.switchbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Switch aSwitch;
    private Switch changeText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = (Switch) findViewById(R.id.switchId);
        changeText = (Switch) findViewById(R.id.changeTextId);
        textView = (TextView) findViewById(R.id.changeTextViewId);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this, "Switch On", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Switch Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        changeText.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textView.setText("Click Switch For On");
                }else{
                    textView.setText("Click Swithc for Off");
                }
            }
        });
    }
}
