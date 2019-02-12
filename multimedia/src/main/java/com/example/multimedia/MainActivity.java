package com.example.multimedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextA textA = new TextA(this);
//        textA.eat();
//
//        Log.e("tag" ,"-------------------");
//
//        TextB textB = new TextB();
//        textB.eat();
//        Log.e("tag" ,"-------------------");
//
       TextB textB1 = new TextA();
//        textB1.eat();
    }
}
