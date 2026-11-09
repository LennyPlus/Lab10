/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 2551365
 */
public class Order {
    private static ITEMS entree;
    private static ITEMS drink;
    private static String specialRequests;
    private static boolean wantWater;

    public static double getTotalPrice() {
        return entree.getPrice() + drink.getPrice();
    }
    
    enum ITEMS {
        // Entrees
        CHICKEN_SALAD(6.50),
        TURKEY_SANDWHICH(6.75),
        VEGETABLE_WRAP(6.00),
        GRILLED_CHEESE(5.00),
        // Drinks
        COFFEE(1.50),
        TEA(1.50),
        SODA(2.00),
        JUICE(1.75);
        
        private final double price;
        
        private ITEMS(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
        
    }
}
