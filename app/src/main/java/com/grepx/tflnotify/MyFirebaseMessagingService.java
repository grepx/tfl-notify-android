package com.grepx.tflnotify;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.util.Pair;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.HashMap;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
  private HashMap<String,Pair<Integer, String>> lines;

  public MyFirebaseMessagingService() {
    lines = new HashMap<>();
    lines.put(LineIds.Bakerloo, new Pair<>(0, "Bakerloo Line"));
    lines.put(LineIds.Central, new Pair<>(1, "Central Line"));
    lines.put(LineIds.Circle, new Pair<>(2, "Circle Line"));
    lines.put(LineIds.District, new Pair<>(3, "District Line"));
    lines.put(LineIds.Dlr, new Pair<>(4, "DLR"));
    lines.put(LineIds.HammersmithCity, new Pair<>(5, "Hammersmith & City Line"));
    lines.put(LineIds.Jubilee, new Pair<>(6, "Jubilee Line"));
    lines.put(LineIds.LondonOverground, new Pair<>(7, "Overground"));
    lines.put(LineIds.Metropolitan, new Pair<>(8, "Metropolitan Line"));
    lines.put(LineIds.Northern, new Pair<>(9, "Northern Line"));
    lines.put(LineIds.Piccadilly, new Pair<>(10, "Piccadilly Line"));
    lines.put(LineIds.Victoria, new Pair<>(11, "Victoria Line"));
    lines.put(LineIds.WaterlooCity, new Pair<>(12, "Waterloo & City Line"));
  }

  @Override public void onMessageReceived(RemoteMessage remoteMessage) {
    super.onMessageReceived(remoteMessage);

    String lineId = remoteMessage.getData().get("lineId");
    String lineStatusDescription = remoteMessage.getData().get("lineStatusDescription");
    String reason = remoteMessage.getData().get("reason");
    Pair<Integer, String> linePair = lines.get(lineId);
    int lineIndex = linePair.first;
    String lineName = linePair.second;

    NotificationCompat.Builder mBuilder =
        new NotificationCompat.Builder(this)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(lineName)
            .setContentText(lineStatusDescription);

    NotificationManager mNotificationManager =
        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

    mNotificationManager.notify(lineIndex, mBuilder.build());
  }
}
