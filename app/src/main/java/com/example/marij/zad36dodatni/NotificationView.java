package com.example.marij.zad36dodatni;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NotificationView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        //dohvat Notification Managera
        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        //cancel metoda za gasenje notificationa na kraju
        nm.cancel(getIntent().getExtras().getInt("notificationID"));
    }
}
