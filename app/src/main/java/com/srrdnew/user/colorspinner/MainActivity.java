package com.srrdnew.user.colorspinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ItemData> list=new ArrayList<>();
        list.add(new ItemData("Red",R.drawable.r));
        list.add(new ItemData("Green",R.drawable.g));
        list.add(new ItemData("Blue",R.drawable.b));

        Spinner sp=(Spinner)findViewById(R.id.spinner);
        SpinnerAdapter adapter=new SpinnerAdapter(this,
                R.layout.spinner_layout,R.id.txt,list);
        sp.setAdapter(adapter);
    }
}

