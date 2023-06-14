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
public class KnockKnock {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        if(nameGuess.equals ("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }
        
        // next if statement accounts for if the middle f is not capitalised
        
        if(nameGuess.equals ("Marty Mcfly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }
        
        else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
    
}

//when .equals is changed to == it no longer compares them as they are different types of primitive values
