/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author gunishinathoo
 */
public class DoItBetter {
    public static void main(String[] args) {

        double miles, my_miles, hot_dogs, my_hot_dogs, languages, my_languages;
        

        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("How many miles can you run?");
        miles = Double.parseDouble(inputReader.nextLine());
        my_miles = (miles*2)+1;
        System.out.println("Well I can run " + my_miles + " miles!");
        
        System.out.println("How many hot dogs can you eat?");
        hot_dogs = Double.parseDouble(inputReader.nextLine());
        my_hot_dogs = (hot_dogs*2)+1;
        System.out.println("Well I can eat " + my_hot_dogs + " hot dogs!");
        
        System.out.println("How many languages do you speak?");
        languages = Double.parseDouble(inputReader.nextLine());
        my_languages = (languages*2)+1;
        System.out.println("Well I can speak " + my_languages + " languages!");
        
        
        

        
    }
    
}
