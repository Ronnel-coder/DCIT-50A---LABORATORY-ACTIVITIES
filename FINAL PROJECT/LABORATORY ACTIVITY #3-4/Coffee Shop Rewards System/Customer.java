/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeeshop;

/**
 *
 * @author Admin
 */
public class Customer {
    private String name;
    private int points;


    private static int totalCustomers = 0;


    public Customer() {
        this.name = "Unknown";  // default name if none is provided
        this.points = 0;
        totalCustomers++;       // increment the total number of customers
    }


    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

 
    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }


    public void addPoints(int earnedPoints) {
        this.points += earnedPoints;
        System.out.println(this.name + " earned " + earnedPoints + " points. Total: " + this.points);
        
    }


    public void redeemReward() {
        if (this.points >= 100) {
            this.points -= 100; // deduct 100 points for each redemption
            System.out.println("Congratulations "+ this.name + "!" + "You redeemed a free drink!");
            System.out.println("Remaining Points: " + points);
            System.out.println("");
        } else {
            System.out.println(this.name + " does not have enough points to redeem a reward.");
        }
    }

 
    public void displayCustomerInfo() {
        System.out.println("");
        System.out.println("Customer Name: " + this.name);
        System.out.println("Points: " + this.points);
        System.out.println("---------------------------------");
    }

    // 🧮 Display total number of customers (STATIC method)
    public static void displayTotalCustomers() {
        System.out.println("Total Registered customers: " + totalCustomers);
        System.out.println("");
        System.out.println("");
    }

    // 💡 Static method to calculate how many rewards a customer can redeem
    public static int getAllowedRewardsRedemption(Customer c) {
        return c.points / 100;  // example: 250 points → 2 rewards
    }

}
