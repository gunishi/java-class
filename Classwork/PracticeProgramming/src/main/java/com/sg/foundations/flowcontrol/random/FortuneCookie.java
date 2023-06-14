/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author gunishinathoo
 */
public class FortuneCookie {
    
    public static void main(String[] args) {
        Random randomizer = new Random();
        System.out.println("Your Geek Fortune: ");

        int x = randomizer.nextInt(11);


        switch (x) {
            case 0:
                System.out.println("Those aren't the droids you're looking for.");
                break;
            case 1:
                System.out.println("Never go in against a Sicilian when death is on the line!");
                break;
            case 2:
                System.out.println("With great power, there must also come — great responsibility.");
                break;
            case 3:
                System.out.println("Never argue with the data.");
                break;
            case 4:
                System.out.println("Try not. Do, or do not. There is no try.");
                break;
            case 5:
                System.out.println("You are a leaf on the wind, watch how you soar.");
                break;
            case 6:
                System.out.println("Do absolutely nothing, and it will be everything that you thought it could be.");
                break;
            case 7:
                System.out.println("Kneel before Zod.");
                break;
            case 8:
                System.out.println("Make it so.");
                break;
            case 9:
                System.out.println("The greatest glory in living lies not in never falling, but in rising every time we fall.");
                break;
            case 10:
                System.out.println("So we beat on, boats against the current, borne back ceaselessly into the past.");
                break;
        }

        System.out.println("And there you have your fortune!");
    }
    
}
