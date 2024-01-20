package com.purplestudio.bucketlistapp.pojo;

public class Thing {

    private String name;
    private String Description;

    private int img;

    public Thing(String name, String description, int img) {
        this.name = name;
        Description = description;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
