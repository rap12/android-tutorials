package com.example.ccs.recyclerview;

/**
 * Created by CCS on 12/02/2017.
 */


import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;
import java.util.ArrayList;


public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {

    //All methods in this adapter are required for a bare minimum recyclerview adapter

    private ArrayList<Fruit> fruitList;
    // Constructor of the class
    public FruitAdapter(ArrayList<Fruit> fruitList) {
        this.fruitList = fruitList;
    }

    // get the size of the list
    @Override
    public int getItemCount() {
        return fruitList == null ? 0 : fruitList.size();
    }


    // specify the row layout file and click for each rowddd
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_fruits, parent, false);
        return new ViewHolder(view);

    }

    // load data in each row element
    @Override
    public void onBindViewHolder(ViewHolder holder, int listPosition) {
        Fruit fruit = fruitList.get(listPosition);
        holder.label.setText(fruit.getLabel());
        holder.icon.setImageResource(fruit.getIcon());

    }

    // Static inner class to initialize the views of rows
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView label;
        ImageView icon;


        public ViewHolder(View itemView) {
            super(itemView);


            label = (TextView) itemView.findViewById(R.id.fruit_label);
            icon = (ImageView) itemView.findViewById(R.id.fruit_img);

            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + label.getText());
            Toast.makeText(view.getContext(), label.getText(), Toast.LENGTH_SHORT).show();

        }
    }
}