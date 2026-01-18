/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.store.main;

/**
 *
 * @author Admin
 */
import com.store.order.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {

    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        // Adding orders
        OnlineOrder o1 = new OnlineOrder(101, 500.00);
        OnlineOrder o2 = new OnlineOrder(102, 1200.00);
        OnlineOrder o3 = new OnlineOrder(103, 300.00);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);

        // Process and pay orders
        o1.processOrder();
        o1.pay();

        o2.processOrder();
        o2.pay();

        // Cancel one order
        o3.processOrder();
        o3.setAmount(300);
        
        // Traversing using Iterator
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getOrderSummary());

            if (order.getStatus() == OrderStatus.CANCELLED) {
                iterator.remove();
            }
        }
    }
}
