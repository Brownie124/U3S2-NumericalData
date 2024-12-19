package com.codedifferently.lab.partA;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
int mondayeggs = 100;
int tuesdayeggs = 121;
int wednesdayeggs = 117;


int dailyAverage = mondayeggs + tuesdayeggs + wednesdayeggs;

int monthlyAverage = mondayeggs + tuesdayeggs + wednesdayeggs;

double eggprice = 0.18;
double monthlyProfit = monthlyAverage * eggprice;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
}
