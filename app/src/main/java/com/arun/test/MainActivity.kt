package com.arun.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import com.salesorder.json.Theater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gson = Gson()
        var theater: Theater = gson.fromJson(Utils.getAssetJsonData(this), Theater::class.java)

        println(theater)
    }
}
