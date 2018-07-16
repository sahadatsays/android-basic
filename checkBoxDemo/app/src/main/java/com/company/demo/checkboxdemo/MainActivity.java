package com.company.demo.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.company.demo.checkboxdemo.R.id.resultTextId;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheck;
    private CheckBox waterCheck;
    private CheckBox sugarCheck;
    private CheckBox mangoCheck;
    private CheckBox juceCheck;

    private Button showBtn;
    private TextView resultText;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheck = (CheckBox) findViewById(R.id.milkId);
        waterCheck = (CheckBox) findViewById(R.id.waterId);
        sugarCheck = (CheckBox) findViewById(R.id.sugarId);
        mangoCheck = (CheckBox) findViewById(R.id.mangoId);
        juceCheck = (CheckBox) findViewById(R.id.juceId);

        showBtn = (Button) findViewById(R.id.showBtnId);
        resultText = (TextView) findViewById(R.id.resultTextId);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();

                if(milkCheck.isChecked()){
                    String value = milkCheck.getText().toString();
                    stringBuilder.append(value + " is Ordered. \n");
                }if(sugarCheck.isChecked()){
                    String value = sugarCheck.getText().toString();
                    stringBuilder.append(value + " is Ordered. \n");
                }if(juceCheck.isChecked()){
                    String value = juceCheck.getText().toString();
                    stringBuilder.append(value + " is Ordered. \n");
                }if(waterCheck.isChecked()){
                    String value = waterCheck.getText().toString();
                    stringBuilder.append(value + " is Ordered. \n");
                }if(mangoCheck.isChecked()){
                    String value = mangoCheck.getText().toString();
                    stringBuilder.append(value + " is Ordered. \n");
                }

                resultText.setText(stringBuilder);
            }
        });

    }
}
