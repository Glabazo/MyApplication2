package com.example.hp1.myapplication;

/**
 * Created by Hp1 on 28/09/2017.
 */

public class Pc {
    private String title;
    private int imageId;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {

        return title;
    }

    public int getImageId() {
        return imageId;
    }

    public Pc(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }
}
