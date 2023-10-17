package com.databit.semana9_video;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoayaka = findViewById(R.id.ayaka);


        String videop = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videop);
        videoayaka.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoayaka.setMediaController(mediaController);
        mediaController.setAnchorView(videoayaka);

        // Iniciar la reproducción del video
        videoayaka.start();
    }
}
