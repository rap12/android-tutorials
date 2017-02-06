package com.example.ccs.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    // Declare the UI component
    GridView gridView;

    // storing string resources into Array
    String[] label = {"a","b","c","d","e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, label);


        gridView.setAdapter(adapter);
    }
}
