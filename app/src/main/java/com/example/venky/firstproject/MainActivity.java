package com.example.venky.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView firstRecyclerview;
    String[] movie_name={"KJF","Aravindh Sameth",
            "Athharintiki Dharedhi","Bahubali", "Bharath Ane Nenu",
            "Geetha Govindham","Jai Lava Kusa","Mr Majnu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstRecyclerview = findViewById(R.id.myrecylerview);
    
        int[] movie_posters ={
          R.drawable.kgf,
                R.drawable.aravindha,
                R.drawable.athha,
                R.drawable.bahubali,
                R.drawable.bharath,
                R.drawable.geetha,
                R.drawable.jai,
                R.drawable.mrmajnu
        };
        firstRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        //MyAdapter dfdfkf = new MyAdapter();
        MyAdapter adapter = new MyAdapter(this,movie_name,movie_posters);
        firstRecyclerview.setAdapter(adapter);
    }
}
