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
public class BiggerBetterAdder {
    public static void main(String[] args) {

        double x, y, z, k;
        
       
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is the first number you would like to add?");
        x = Double.parseDouble(inputReader.nextLine());
        
        System.out.println("What is the second number you would like to add?");
        y = Double.parseDouble(inputReader.nextLine());
        
        System.out.println("What is the third number you would like to add?");
        z = Double.parseDouble(inputReader.nextLine());
        
        k = x+y+z;
        
        System.out.println(x + " + " + y + " + " + z + " = " + k);
        

        
        
             
                
    }
    
}
