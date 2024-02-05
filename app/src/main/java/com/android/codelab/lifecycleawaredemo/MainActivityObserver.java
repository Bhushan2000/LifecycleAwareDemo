package com.android.codelab.lifecycleawaredemo;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {
    private static final String TAG = "MainActivityObserver";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
// it takes parameter event // This annotations keep tack of the events
    // We need to perform some action for the onCreate event
    public void onCreateEvent() {
        Log.d(TAG, "onCreateEvent: ON_CREATE");
        // here onCreateEvent() event for LifecycleOwner(i.e.,Activity) this line of code executed.
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent() {
        Log.d(TAG, "onStartEvent: ON_STARTED");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent() {
        Log.d(TAG, "onResumeEvent: ON_RESUME");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent(){
        Log.d(TAG, "onPauseEvent: ON_PAUSE");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent(){
        Log.d(TAG, "onStopEvent: ON_STOP");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent(){
        Log.d(TAG, "onDestroyEvent: ON_DESTROY");
    }

}
