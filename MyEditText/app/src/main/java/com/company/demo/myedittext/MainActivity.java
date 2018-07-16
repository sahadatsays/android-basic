package com.company.demo.myedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity {

    //diclaration variable

    private EditText first_num;
    private EditText second_num;
    private TextView resultView;


    private Button add;
    private Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find input operation values for

        first_num = (EditText) findViewById(R.id.num_one);
        second_num = (EditText) findViewById(R.id.num_two);
        resultView = (TextView) findViewById(R.id.resultViewId);

        add = (Button) findViewById(R.id.addId);
        sub = (Button) findViewById(R.id.subId);

        //create object handler
        Handler handler = new Handler();

        //set OnclickeListener
        add.setOnClickListener(handler);
        sub.setOnClickListener(handler);

    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            try {
                //get data to input box and converted to string
                String number_one = first_num.getText().toString();
                String number_two = second_num.getText().toString();

                //convert into double data type
                double num1 = Double.parseDouble(number_one);
                double num2 = Double.parseDouble(number_two);

                if(view.getId() == R.id.addId){
                    double sum = num1+num2;
                    resultView.setText("Your Result is : "+sum);

                }else if(view.getId() == R.id.subId){
                    double sub = num1-num2;
                    resultView.setText("Your Result is : "+sub);
                }
            }catch (Exception e){

                resultView.setText("Please Enter valid number");
            }

        }
    }
}
