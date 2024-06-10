package com.example.chronotracker

import android.app.Application
import android.content.Context

class App : Application() {

    override fun onCreate(){
        super.onCreate()
        context = applicationContext
    }

    companion object {
        lateinit var context: Context
        private set
    }
    //Declare custom 'Application' class in 'AndroidManifest.xml'
    //<application:name=".App"
    // ...
    // >
    // ...
    // </application>
}