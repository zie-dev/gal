package com.example.amd.project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

public class Main2Activity extends AppCompatActivity {

    private VideoView myvideo;
    private MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        setContentView(R.layout.activity_main2);

        File clip=new File(Environment.getExternalStorageDirectory(),"tutorial.mp4");
        if (clip.exists()){
            myvideo=(VideoView)findViewById(R.id.video);
            myvideo.setVideoPath(clip.getAbsolutePath());
            mediaController=new MediaController(this);
            mediaController.setMediaPlayer(myvideo);
            myvideo.setMediaController(mediaController);
            myvideo.requestFocus();
            myvideo.start();
        }
    }
}
