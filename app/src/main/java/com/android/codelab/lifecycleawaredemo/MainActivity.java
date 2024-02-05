package com.android.codelab.lifecycleawaredemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Activity is LifecycleOwner
        // that means it has its own lifecycle

        // We create LifeCycleObserver class and assign it to this LifeCycleOwner

        Log.d(TAG, "Owner onCreate: called");
        

        // to observe the LifecycleOwner events we need to add LifecycleObserver (i.e., MainActivityObserver)
        getLifecycle().addObserver(new MainActivityObserver());
        // MainActivityObserver observe the LifecycleOwner(i.e., MainActivity) events. like., onCreate,onStart,etc
        // When onCreate() of LifecycleOwner (MainActivity.java) executed then the action associated with the lifecycleEvent of OnCreate in the Observer will be executed.


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Owner onStart: is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Owner onResume: is called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Owner onPause: is called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Owner onStop: is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Owner onDestroy: is called");
    }







}