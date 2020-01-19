package com.example.amd.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity{

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listView = (ListView)findViewById(R.id.ListView);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Sempurna","Andra and the Backbone", R.raw.sempurna));
        arrayList.add(new Music("Cinta Pertama","Mikha Tambayong", R.raw.mikha));
        arrayList.add(new Music("Surat starla","virgoun", R.raw.surat));
        arrayList.add(new Music("Falling in love","J-Roks", R.raw.fall));
        arrayList.add(new Music("Ceria","J-Roks", R.raw.ceria));


        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item,arrayList);
        listView.setAdapter(adapter);

    }

}
