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
public class PassingTheTuringTest {
    public static void main(String[] args) {

        double my_num, total, their_num;
        String name, colour, fruit, number;

        Scanner inputReader = new Scanner(System.in);

        my_num = 8;

        System.out.println("Hello there, what is your name? ");
        name = inputReader.nextLine();
        
        System.out.println("Hi " + name + "! I'm Jeev");
        System.out.println("What's your favourite colour?");
        colour = inputReader.nextLine();
        System.out.println("Huh, " + colour + "? Mine's turquoise.");
        System.out.println("My favourite fruit is dragonfruit, what about you " + name + "?");
        fruit = inputReader.nextLine();
        System.out.println("Really?! I don't like " + fruit + " at all!");
        System.out.println("speaking of favourites, what is your favourite number? ");
        their_num = Double.parseDouble(inputReader.nextLine());
        total = my_num + their_num;
        
        System.out.println("Cool, mine is 8, did you know that 8 + " + their_num + " = " + total);
        System.out.println("Well, thanks for talking to me " + name);
        

        
    }
    
}
