package com.example.ccs.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Fruit> listFruit  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loadFruits();

        FruitAdapter fruitAdapter = new FruitAdapter(listFruit);

        recyclerView = (RecyclerView) findViewById(R.id.item_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(fruitAdapter);


    }

    void loadFruits(){

            listFruit.add(new Fruit(R.drawable.fruit_banana, "Banana"));
            listFruit.add(new Fruit(R.drawable.fruit_apple, "Apple"));
            listFruit.add(new Fruit(R.drawable.fruit_grapes, "Grapes"));
            listFruit.add(new Fruit(R.drawable.fruit_blueberry, "Blueberry"));
            listFruit.add(new Fruit(R.drawable.fruit_lemon, "Lemon"));
            listFruit.add(new Fruit(R.drawable.fruit_strawberry, "Strawberry"));


    }

}