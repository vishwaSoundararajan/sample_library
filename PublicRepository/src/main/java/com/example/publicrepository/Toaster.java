package com.example.publicrepository;

import android.content.Context;
import android.widget.Toast;

public class Toaster {


    public static void SimpleToast(Context context, String msg){
        Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
    }
}
