package com.cydeo.TestingTask;

public class AppleWeight implements HeavierG {

    @Override
    public void heavierG(int AppleWeightGram) {
        if (!(AppleWeightGram >= 200)) {
            System.err.println("Find all apples heavier than 200 g");
        }else {
            System.out.println("Apple weight is " + AppleWeightGram);
        }
    }

}
