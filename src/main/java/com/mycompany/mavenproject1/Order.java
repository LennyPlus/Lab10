/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

/**
 *
 * @author 2551365
 */
public class Order {
    private static String entree;
    private static String drink;
    private static String specialRequests;
    private static boolean wantWater;
    
    public static Map<String, Double> items = Map.ofEntries(
            // Entree
            entry("Chicken Salad", Double.valueOf(6.50)),
            entry("Turkey Sandwhich", Double.valueOf(6.75)),
            entry("Vegetable Wrap", Double.valueOf(6.00)),
            entry("Grilled Cheese", Double.valueOf(5.00)),
            // Drinks
            entry("Coffee", Double.valueOf(1.50)),
            entry("Tea", Double.valueOf(1.50)),
            entry("Soda", Double.valueOf(2.00)),
            entry("Juice", Double.valueOf(1.75)));
    
    
    public static double getTotalPrice() {
        return items.get(entree) + items.get(drink);
    }

    public static void setEntree(String entree) {
        Order.entree = entree;
    }

    public static void setDrink(String drink) {
        Order.drink = drink;
    }

    public static void setSpecialRequests(String specialRequests) {
        Order.specialRequests = specialRequests;
    }

    public static void setWantWater(boolean wantWater) {
        Order.wantWater = wantWater;
    }

    public static String getEntree() {
        return entree;
    }

    public static String getDrink() {
        return drink;
    }
    
    
    
    
    
    
}
