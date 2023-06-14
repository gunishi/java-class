/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author gunishinathoo
 */
public class MenuOfChampions {
    
    public static void main(String[] args) {

        double price_1, price_2, price_3;
        String food_1, food_2, food_3;
        
        food_1 = "Lobster";
        food_2 = "Steak";
        food_3 = "Potatoes";
        
        price_1 = 55;
        price_2 = 38;
        price_3 = 10;
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        Welcome to cafe rouge");
        System.out.println("        Today's menu is: ");
        
       System.out.println("     " + food_1 + " ~ " + price_1);
       System.out.println("     " + food_2 + " ~ " + price_2);
       System.out.println("     " + food_3 + " ~ " + price_3);
                
    }
    
}
