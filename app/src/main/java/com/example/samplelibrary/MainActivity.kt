package com.example.samplelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.publicrepository.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Toaster.SimpleToast(this, "Android Library!!");
    }

fun buttonClick(view: View?){
    Toaster.SimpleToast(this, "Android Library Toast!!");
}

}

