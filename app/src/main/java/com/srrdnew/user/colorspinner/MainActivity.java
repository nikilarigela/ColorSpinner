package com.srrdnew.user.colorspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int redColorCode = 0xff0000;
    int greenColorCode = 0x00ff00;
    int blueColorCode = 0x0000ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.imageView);
        CharacterDrawable drawable = new CharacterDrawable('A', 0xFF805781);
        image.setImageDrawable(drawable);


        ArrayList<ItemData> list = new ArrayList<>();
        list.add(new ItemData("Red", redColorCode));
        list.add(new ItemData("Green", greenColorCode));
        list.add(new ItemData("Blue", blueColorCode));

        final Spinner sp = (Spinner) findViewById(R.id.spinner);
        SpinnerAdapter adapter = new SpinnerAdapter(this,
                R.layout.spinner_layout, R.id.txt, list);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //Our code if item selected
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}

