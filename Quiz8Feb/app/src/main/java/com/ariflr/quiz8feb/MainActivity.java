package com.ariflr.quiz8feb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // deklarasi Grid
    GridView cusgrid;
    Integer [] gambar = {
            R.drawable.hotel,
            R.drawable.tours,
            R.drawable.kuliner,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter adapter = new CustomAdapter(this, gambar);
        cusgrid = (GridView) findViewById(R.id.customgrid);
        cusgrid.setAdapter(adapter);

        cusgrid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int p, long id) {
                Toast.makeText(getApplicationContext(), gambar[p], Toast.LENGTH_LONG).show();

                switch (p) {
                    case 0:
                        Intent i = new Intent(getApplicationContext(), ActivityListview.class);
                        startActivity(i);
                        break;
                    case 1:

                        //Use some different intent here
                        Intent j = new Intent(getApplicationContext(), ActivityListview2.class);
                        startActivity(j);
                        break;
                    case 2:
                        Intent f = new Intent(getApplicationContext(), ActivityRecycler.class);
                        startActivity(f);
                        break;
                }
            }
        });


    }
}
