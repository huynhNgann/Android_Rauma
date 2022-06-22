package com.huynhngan.storeraumaapp.models;

public class FeaturedModel {
    int image;
    String name;
    String des;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public FeaturedModel(int image, String name, String des) {
        this.image = image;
        this.name = name;
        this.des = des;
    }
}
