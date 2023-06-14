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
public class TriviaNight {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        double ans_1, ans_2, ans_3;
        int counter;
        
        counter = 0;
        
        System.out.println("First question:");
        System.out.println("What is the longest river in the world?");
        System.out.println("1) Nile     2)Thames      3)Ganges      4)Amazon River");
        
        ans_1 = Double.parseDouble(inputReader.nextLine());
        
        if (ans_1 == 1) {
            counter++;
            System.out.println("That is the correct answer!");
            System.out.println("There are 2 questions remaining");
            System.out.println("Your score is " + counter);
        }
        
        else {
            
            System.out.println("Sorry that was incorrect");
            System.out.println("There are 2 questions remaining");
            System.out.println("Your score is " + counter);
        }
        
        System.out.println("Second question:");
        System.out.println("What is the capital of Scotland?");
        System.out.println("1) Glasgow     2)Edinburgh      3)Aberdeen      4)Dundee");
        
        ans_2 = Double.parseDouble(inputReader.nextLine());
        
        if (ans_2 == 2) {
            counter++;
            System.out.println("That is the correct answer!");
            System.out.println("There is 1 question remaining");
            System.out.println("Your score is " + counter);
        }
        
        else {
            
            System.out.println("Sorry that was incorrect");
            System.out.println("There is 1 question remaining");
            System.out.println("Your score is " + counter);
        }
        
        
        System.out.println("Third question:");
        System.out.println("How many planets in the Solar System?");
        System.out.println("1) 4     2)3      3)7     4)8");
        
        ans_3 = Double.parseDouble(inputReader.nextLine());
        
        if (ans_3 == 4) {
            counter++;
            System.out.println("That is the correct answer!");
            System.out.println("The quiz is finished!");
            System.out.println("Your score is " + counter);
            
            if (counter == 0){
                System.out.println("Your score is: " + counter + " Better luck next time!");
            }
            if (counter == 1){
                System.out.println("Your score is: " + counter + " That's a great start!");
            }
            if (counter == 2){
                System.out.println("Your score is: " + counter + " Almost full-score!");
            }
            if (counter == 3){
                System.out.println("Your score is: " + counter + " Very impressive!");
            }
        }
        
        else {
            
            System.out.println("Sorry that was incorrect");
            System.out.println("The quiz is finished!");
            System.out.println("Your score is " + counter);
            
            if (counter == 0){
                System.out.println("Your score is: " + counter + " Better luck next time!");
            }
            if (counter == 1){
                System.out.println("Your score is: " + counter + " That's a great start!");
            }
            if (counter == 2){
                System.out.println("Your score is: " + counter + " Almost full-score!");
            }
            if (counter == 3){
                System.out.println("Your score is: " + counter + " Very impressive!");
            }
        }
    }
    
}
