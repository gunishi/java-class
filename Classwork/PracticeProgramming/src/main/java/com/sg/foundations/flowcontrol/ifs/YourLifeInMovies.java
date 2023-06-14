/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author gunishinathoo
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        double d_o_b;
        
        Scanner inputReader = new Scanner(System.in);


        System.out.println("Enter your date of birth: ");
        d_o_b = Double.parseDouble(inputReader.nextLine());
        

        if (d_o_b < 2005) {
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        }

        if(d_o_b < 1995){
            System.out.println("The first Harry Potter came out over 15 years ago!");
        }

        if(d_o_b < 1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
        }
        
        if(d_o_b < 1965){
            System.out.println("The MASH TV series has been around for almost half a century!");
        }
    }
    
}
