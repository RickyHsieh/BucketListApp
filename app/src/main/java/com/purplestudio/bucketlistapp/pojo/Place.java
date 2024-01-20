package com.purplestudio.bucketlistapp.pojo;

import androidx.annotation.DrawableRes;

public class Place {
    private String name;
    private String description;
    private int img;

    private float decimalValue;

    public Place(String name, String description, @DrawableRes int img, float decimalValue) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.decimalValue = decimalValue;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDecimalValue() {
        return decimalValue;
    }

    public void setDecimalValue(float decimalValue) {
        this.decimalValue = decimalValue;
    }
}
