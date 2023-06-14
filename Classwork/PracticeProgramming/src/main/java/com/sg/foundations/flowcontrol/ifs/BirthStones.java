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
public class BirthStones {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        double birth_month;


        System.out.println("Input your birth month as a whole number, for example, January would be 1 ");
        birth_month = Double.parseDouble(inputReader.nextLine());
        
        if (birth_month == 1) {
            System.out.println("January's birthstone is Garnet");
        }
        
        if (birth_month == 2) {
            System.out.println("February's birthstone is Amethyst");
        }
        
        if (birth_month == 3) {
            System.out.println("March's birthstone is Aquamarine");
            
        }
        
        if (birth_month == 4) {
            System.out.println("April's birthstone is Diamond");
        }
        
        
        if (birth_month == 5) {
            System.out.println("May's birthstone is Emerald");
        }
        
        if (birth_month == 6) {
            System.out.println("June's birthstone is Pearl");
        }
        
        if (birth_month == 7) {
            System.out.println("July's birthstone is Ruby");
        }
        
        if (birth_month == 8) {
            System.out.println("August's birthstone is Peridot");
        }
        
        if (birth_month == 9) {
            System.out.println("September's birthstone is Sapphire");
        }
        
        if (birth_month == 10) {
            System.out.println("October's birthstone is Opal");
        }
        
        if (birth_month == 11) {
            System.out.println("November's birthstone is Topaz");
        }
        
        if (birth_month == 12) {
            System.out.println("December's birthstone is Turquoise");
        }
        
        else {
            
            System.out.println("The input format is incorrect.");
        }
    }
    
}
