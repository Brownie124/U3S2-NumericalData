package com.codedifferently.lab.partA;


public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int eggsPerChicken = 5;
        int chickenCount = 3;

        int mondayeggs = eggsPerChicken * chickenCount;

        chickenCount++;
        int tuesdayeggs = eggsPerChicken * chickenCount;

        chickenCount /= 2;
        int wednesdayeggs = eggsPerChicken * chickenCount;

        int totalEggs = mondayeggs + tuesdayeggs + wednesdayeggs;

        System.out.println("Total eggs collected: " + totalEggs);
    }
}

