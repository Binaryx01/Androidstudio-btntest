package com.xstudioo.btntest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);

        Button button1 = (Button) findViewById(R.id.button1);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
                
            }
        });


    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast.makeText(MainActivity.this, "Second button", Toast.LENGTH_SHORT).show();



        }
    });




    }
}
