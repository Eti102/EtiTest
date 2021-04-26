package com.company;

public class Test2 {
    public static void main(String[] args) {

        TheOneAndOnly t1 = TheOneAndOnly.getInstance();

        System.out.println(t1.getX());
    }
}
