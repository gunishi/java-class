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
public class GuessMe {
    public static void main(String[] args) {
        double my_num = 52;
        double their_num;
        
        Scanner inputReader = new Scanner(System.in);


        System.out.println("I've chosen a whole number between 1 and 100. Betcha can't guess it! ");
        System.out.println("Your guess: ");
        their_num = Double.parseDouble(inputReader.nextLine());
        

        if (my_num == their_num) {
            System.out.println("Wow, nice guess! That was it!");
        }

        if(their_num < my_num){
            System.out.println("Ha, nice try - too low! I chose " + my_num);
        }

        if(their_num > my_num){
            System.out.println("Too bad, way too high. I chose " + my_num);
        }


    }
    
}
