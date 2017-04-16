package com.grepx.tflnotify;

import android.app.Application;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Bakerloo);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Central);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Circle);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.District);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Dlr);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.HammersmithCity);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Jubilee);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.LondonOverground);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Metropolitan);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Northern);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Piccadilly);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.Victoria);
    FirebaseMessaging.getInstance().subscribeToTopic(LineIds.WaterlooCity);
  }
}
