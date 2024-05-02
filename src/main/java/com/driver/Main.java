package com.driver;

public class Main {
    public static void main(String[]args){
        //object creating for RWonly class
        RWOnly obj = new RWOnly();
        //task-4: java: error-name has private access in com.driver.RWOnly
        //obj.name = "Sai";
        //System.out.println(obj.name);
        obj.setName("sai");
        System.out.println(obj.getName());
    }
}