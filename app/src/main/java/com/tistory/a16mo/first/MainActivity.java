package com.tistory.a16mo.first;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button1onclick(View v) {
        Toast.makeText(getApplicationContext(), "버튼이 눌러짐", Toast.LENGTH_LONG).show();
    }

}
