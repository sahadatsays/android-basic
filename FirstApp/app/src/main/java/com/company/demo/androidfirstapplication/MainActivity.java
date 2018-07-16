package com.company.demo.androidfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    private Button enterBtn;
    private Button loginBtn;
    private TextView enterBtnMsg, btnMsg;
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        find button and textview
        enterBtn = (Button) findViewById(R.id.enter_btn_id);
        loginBtn = (Button) findViewById(R.id.btnLoginId);

        btn1 = (Button) findViewById(R.id.btn1Id);
        btn2 = (Button) findViewById(R.id.btn2Id);

        btnMsg = (TextView) findViewById(R.id.btnMsgId);
        enterBtnMsg = (TextView) findViewById(R.id.enter_btn_msg);

//        make handler object
        Handler handler = new Handler();

        btn1.setOnClickListener(handler);
        btn2.setOnClickListener(handler);

        /*
        * Another method for add listener
        *
        * */

        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "You Clicked on Enter Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //tost position
                Toast toast = Toast.makeText(MainActivity.this, "You Clicked On Login Button", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP, 0,5);
                toast.show();
            }
        });

    }

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btn1Id){
                btnMsg.setText("Clicked Button One");
            }else if (view.getId() == R.id.btn2Id){
                btnMsg.setText("Clicked Button Two");
            }
        }
    }
}
