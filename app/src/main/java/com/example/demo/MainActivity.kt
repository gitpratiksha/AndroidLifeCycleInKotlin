package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;
class MainActivity : AppCompatActivity() {
    var my_state="custom";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(my_state,"on create")
    }

    override fun onStart() {
        super.onStart()
        Log.i(my_state,"on start")

    }

    override fun onResume() {
        super.onResume()
        Log.i(my_state, "on resume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(my_state,"on pause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(my_state,"on stop")

    }

    override fun onRestart() {
        super.onRestart()
        Log.i(my_state,"on restart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(my_state,"on destroy")

    }


}