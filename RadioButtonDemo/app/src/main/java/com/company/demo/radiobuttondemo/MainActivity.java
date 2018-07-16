package com.company.demo.radiobuttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton gender;
    private Button showBtn;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radionGroupId);
        showBtn = (Button) findViewById(R.id.showBtnId);
        textView = (TextView) findViewById(R.id.textViewId);


        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                gender = (RadioButton) findViewById(selectedId);

               String value = gender.getText().toString();

               textView.setText(value + " You are Selected.");
            }
        });

    }
}
