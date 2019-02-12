package com.example.multimedia;

import android.content.Context;
import android.util.Log;

public class TextB {
    public TextB(){
        Log.e("tag" ,"我是TextB");
    }

    public TextB(Context context){
        Log.e("tag" ,"我是TextB + context");
    }

    public void eat(){
        Log.e("tag" ,"我是TextB 执行 eat");
    }
}
