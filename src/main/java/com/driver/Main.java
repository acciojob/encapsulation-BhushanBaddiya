package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setter("bhushan");
        System.out.println(obj.getter());


    }
}