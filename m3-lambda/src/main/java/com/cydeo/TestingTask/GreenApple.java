package com.cydeo.TestingTask;

public class GreenApple implements AppleColor{

    public void appleColor(String color) {

        if (color.equals("green")) {
            System.out.println("Green Apple");
        }else {
            System.err.println("Find all green apples in the inventory");
        }

    }

}
