package com.grepx.tflnotify;

import android.app.Application;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    FirebaseMessaging.getInstance().subscribeToTopic("bakerloo");
    FirebaseMessaging.getInstance().subscribeToTopic("central");
    FirebaseMessaging.getInstance().subscribeToTopic("circle");
    FirebaseMessaging.getInstance().subscribeToTopic("district");
    FirebaseMessaging.getInstance().subscribeToTopic("dlr");
    FirebaseMessaging.getInstance().subscribeToTopic("hammersmith-city");
    FirebaseMessaging.getInstance().subscribeToTopic("jubilee");
    FirebaseMessaging.getInstance().subscribeToTopic("london-overground");
    FirebaseMessaging.getInstance().subscribeToTopic("metropolitan");
    FirebaseMessaging.getInstance().subscribeToTopic("northern");
    FirebaseMessaging.getInstance().subscribeToTopic("piccadilly");
    FirebaseMessaging.getInstance().subscribeToTopic("victoria");
    FirebaseMessaging.getInstance().subscribeToTopic("waterloo-city");
  }
}
