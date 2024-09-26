package com.example.pathfit2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class settingsContent extends AppCompatActivity {
    private SeekBar volumeSeekBar;
    private TextView volumeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings_content);

        // Start the Music Service
        Intent musicServiceIntent = new Intent(this, musicPlayer.class);
        startService(musicServiceIntent);

        volumeSeekBar = findViewById(R.id.volumeSeekBar);
        volumeTextView = findViewById(R.id.volumeControlTxt); // Add this line to reference the TextView

        // Load saved volume
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        float volume = prefs.getFloat("volume", 1.0f);
        volumeSeekBar.setProgress((int) (volume * 100)); // Set SeekBar progress

        // Display current volume
        volumeTextView.setText("Volume: " + (int) (volume * 100) + "%");

        // Set up the SeekBar change listener
        volumeSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float newVolume = progress / 100f; // Convert to 0.0 to 1.0
                SharedPreferences.Editor editor = prefs.edit();
                editor.putFloat("volume", newVolume);
                editor.apply();

                // Update the volume in the music service
                Intent intent = new Intent(settingsContent.this, musicPlayer.class);
                intent.putExtra("volume", newVolume);
                startService(intent);

                // Update the displayed volume percentage
                volumeTextView.setText("Volume: " + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
