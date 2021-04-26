package com.company;

public class TheOneAndOnly {

    //1
    private static TheOneAndOnly instance = new TheOneAndOnly();

    private int x = (int)(Math.random()*101);

    //2
    private TheOneAndOnly(){
        System.out.println("CTOR IN ACTION "+this.getClass().getSimpleName()+" WAS INVOKED");
    }

    //3
    public static TheOneAndOnly getInstance() {
        return instance;
    }

    public int getX() {
        return x;
    }
}
