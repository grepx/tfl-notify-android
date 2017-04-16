package com.grepx.tflnotify;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
  public MyFirebaseMessagingService() {
  }

  @Override public void onMessageReceived(RemoteMessage remoteMessage) {
    super.onMessageReceived(remoteMessage);

    String lineId = remoteMessage.getData().get("lineId");
    int lineStatus = Integer.valueOf(remoteMessage.getData().get("lineStatus"));

    NotificationManager notificationManager =
        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

    if (lineStatus == 10 // Good Service
        || lineStatus == 20 // Service Closed
        )
    {
      // remove any previous status notification
      notificationManager.cancel(lineId, 0);
    } else {
      String lineStatusDescription = remoteMessage.getData().get("lineStatusDescription");
      String reason = remoteMessage.getData().get("reason");
      String lineName = Lines.getName(lineId);

      // show the new status notification
      NotificationCompat.Builder mBuilder =
          new NotificationCompat.Builder(this)
              .setSmallIcon(R.mipmap.ic_launcher)
              .setContentTitle(lineName)
              .setContentText(lineStatusDescription);

      notificationManager.notify(lineId, 0, mBuilder.build());
    }
  }
}
