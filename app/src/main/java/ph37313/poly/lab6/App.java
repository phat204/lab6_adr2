package ph37313.poly.lab6;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class App extends Application {
    public static final String Channel_id = "CHANNEL_ID";

    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    @SuppressLint("NewApi")
    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.DONUT) {
            NotificationChannel channel = new NotificationChannel(
                    Channel_id,
                    "CHANNEL",
                    NotificationManager.IMPORTANCE_DEFAULT
            );
            channel.setDescription("Thong bao cu the");
            NotificationManager manager = getSystemService(NotificationManager.class);
            if (manager!=null) {
                manager.createNotificationChannel(channel);
            }
        }
    }
}
