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
public class FieldDay {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        String surname;

        System.out.println("What is your surname");
        surname = userInput.nextLine();
        
        String baggins = "baggins";
        String dresden = "Dresden";
        String howl = "Howl";
        String potter = "Potter";
        String vimes = "Vimes";

        

        // Conditionals should go here! Here's the first one for FREE!

        if (surname.compareToIgnoreCase(baggins)<0) {
            System.out.println("You're on the team Red Dragons!");
            System.out.println("Good luck in the games!");
        }
        
        if (0 <=surname.compareToIgnoreCase(baggins) && surname.compareToIgnoreCase(dresden)<0 ) {
            System.out.println("You're on the team Dark Wizards!");
            System.out.println("Good luck in the games!");
        }
        
        if (0 <=surname.compareToIgnoreCase(dresden) && surname.compareToIgnoreCase(howl)<0 ) {
            System.out.println("You're on the team Moving Castles!");
            System.out.println("Good luck in the games!");
        }
        
        if (0 <=surname.compareToIgnoreCase(howl) && surname.compareToIgnoreCase(potter)<0 ) {
            System.out.println("You're on the team Golden Snitches!");
            System.out.println("Good luck in the games!");
        }
        
        if (0 <=surname.compareToIgnoreCase(potter) && surname.compareToIgnoreCase(vimes)<0 ) {
            System.out.println("You're on the team Night Guards!");
            System.out.println("Good luck in the games!");
        }
        
        if (surname.compareToIgnoreCase(vimes)>0 ) {
            System.out.println("You're on the team Black Holes!");
            System.out.println("Good luck in the games!");
        }
        
        
        
        
    }
    
}
