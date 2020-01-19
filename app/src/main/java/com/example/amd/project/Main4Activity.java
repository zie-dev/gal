package com.example.amd.project;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    ImageView imageView;
    Button nextImage, previousImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image_view);
        nextImage = (Button) findViewById(R.id.next_image);
        previousImage = (Button) findViewById(R.id.previous_image);
        previousImage.setVisibility(View.INVISIBLE);
    }

    public void nextImage(View view) {
        imageView.setImageResource(R.drawable.image1);
        previousImage.setVisibility(View.VISIBLE);
        nextImage.setVisibility(View.INVISIBLE);
    }

    public void previousImage(View view) {
        imageView.setImageResource(R.drawable.image3);
        previousImage.setVisibility(View.INVISIBLE);
        nextImage.setVisibility(View.VISIBLE);
    }
}