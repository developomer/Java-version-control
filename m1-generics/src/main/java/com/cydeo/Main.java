package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
   //     items.add("Apple");


        printDoubled(items);

        System.out.println("*****************************");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team <SoccerPlayer> liverpool= new Team("Liverpool");
        // liverpool.addPlayer(joe);
        // liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        // Team<String> brokenTeam = new Team<>("what kinde of team is this ? ");

        
    }

    private static void printDoubled(ArrayList<Integer> items) {
        for (Object i : items) {
            System.out.println((Integer) i * 2);
        }
    }
}
