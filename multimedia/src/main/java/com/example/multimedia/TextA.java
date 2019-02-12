package com.example.multimedia;

import android.content.Context;
import android.util.Log;

public class TextA extends TextB{
    public TextA(){
        Log.e("tag " , "我是TextA");
    }

    public TextA(Context context){
        super(context);
        Log.e("tag " , "我是TextA + context");
    }

    @Override
    public void eat() {
     //   super.eat();
        Log.e("tag " , "我是TextA 执行 eat");
    }
}
