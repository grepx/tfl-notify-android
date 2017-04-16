package com.grepx.tflnotify;

import android.app.Application;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Bakerloo);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Central);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Circle);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.District);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Dlr);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.HammersmithCity);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Jubilee);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.LondonOverground);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Metropolitan);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Northern);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Piccadilly);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.Victoria);
    FirebaseMessaging.getInstance().subscribeToTopic(Lines.WaterlooCity);
  }
}
