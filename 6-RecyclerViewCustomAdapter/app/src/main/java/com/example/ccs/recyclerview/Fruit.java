package com.example.ccs.recyclerview;

/**
 * Created by CCS on 12/02/2017.
 */

public class Fruit {

    private int icon;
    private String label;

    public Fruit(int icon, String label) {
        this.icon = icon;
        this.label = label;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public void setTitle(String title) {
        this.label = title;
    }

}
