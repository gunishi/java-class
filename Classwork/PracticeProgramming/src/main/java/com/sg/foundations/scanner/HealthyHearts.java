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
public class HealthyHearts {
    
    public static void main(String[] args) {

        double age, max, lb_target, ub_target;
        

        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = Double.parseDouble(inputReader.nextLine());
        
        max = 220 - age;
        lb_target = max*0.5d;
        ub_target = max*0.85d;
        
        System.out.println("Your maximum heart rate should be " + max + " beats per minute.");
        System.out.println("Your target HR zone is " + lb_target + " - " + ub_target + " beats per minute.");
        
        
        

        
    }
    
    
    
}
