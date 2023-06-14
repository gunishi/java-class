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
public class AllTheTrivia {
    public static void main(String[] args) {

        
        String name, num_of_planets, cap_scot, bball_team, long_river;

        Scanner inputReader = new Scanner(System.in);

      

        System.out.println("How many planets are there in the solar system? ");
        num_of_planets = inputReader.nextLine();
        
        System.out.println("What is the capital of Scotland?");
        cap_scot = inputReader.nextLine();
        
        System.out.println("How many players in a basketball team on the court?");
        bball_team = inputReader.nextLine();
        
        System.out.println("What is the longest river in the world?");
        long_river = inputReader.nextLine();
        
        System.out.println("What?! The capital of Scotland is " + long_river);
        System.out.println("I didn't know there are " + bball_team + " planets in the Solar System!");
        System.out.println("That's amazing that the longest river in the world is " + cap_scot);
        System.out.println("Cool, there are " + num_of_planets + " on a baskeball team!");
        
        

        
    }
    
}
