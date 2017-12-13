package com.example.jilyyang.test_recyclerview;

/**
 * Created by jilyyang on 2017-12-13.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name , int imageId){
        this.imageId = imageId;
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public int  getImageId(){
        return imageId;
    }
}

