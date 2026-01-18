/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coffeeshop;

/**
 *
 * @author Admin
 */
public class CoffeeShop {
    public static void main(String[] args) {
 
        Customer c1 = new Customer("Joseph", 200);
        Customer c2 = new Customer("Peter");      // starts with 0 points
        Customer c3 = new Customer();             // no name given

        c2.addPoints(150); // pastries and beverages
        c2.addPoints(20);  // water
        System.out.println("");

        c1.redeemReward();
        c2.redeemReward();
        c3.redeemReward();
        System.out.println("");
        System.out.println("");
        

   
        System.out.println("");
        System.out.println("----Customers Information----");
        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
        c3.displayCustomerInfo();
        Customer.displayTotalCustomers();

        
        
        Customer c4 = new Customer("Diane");
        c4.addPoints(50);
        c4.displayCustomerInfo();
        c4.displayTotalCustomers();

     
        System.out.println("Joseph " + "can redeem " + c1.getAllowedRewardsRedemption(c1) + " reward(s)." );
        System.out.println("Peter " + "can redeem " + c2.getAllowedRewardsRedemption(c2) + " reward(s)." );
        System.out.println("unknown " + "can redeem " + c3.getAllowedRewardsRedemption(c3) + " reward(s)." );
        System.out.println("Diane " + "can redeem " + c4.getAllowedRewardsRedemption(c4) + " reward(s)." );
    }
}
