package com.company.demo.showdatepickerdemo;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textViewId);
        button   = (Button) findViewById(R.id.btnId);

        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        DatePicker datePicker = new DatePicker(this);
        int currentYear = datePicker.getYear();
        int currentMonth = (datePicker.getMonth())+1;
        int currentDay = datePicker.getDayOfMonth();


        datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        textView.setText("Selected Date : "+i2+"/"+(i1+1)+"/"+i);
                    }
                }, currentYear, currentMonth, currentDay);

        datePickerDialog.show();

    }
}
