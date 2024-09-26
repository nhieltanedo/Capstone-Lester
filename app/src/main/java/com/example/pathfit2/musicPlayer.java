package com.example.pathfit2;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class musicPlayer extends Service {
    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this, R.raw.crystalineharmonics); //kukuhanin yung music sa raw folder path
        mediaPlayer.setLooping(true); //loop bg music
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null) {
            if (intent.hasExtra("volume")) {
                float volume = intent.getFloatExtra("volume", 1.0f);
                setVolume(volume);
            }
        }

        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
        return START_STICKY;
    }

    private void setVolume(float volume) {
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(volume, volume);
        }
    }

    @Override
    public void onDestroy() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
