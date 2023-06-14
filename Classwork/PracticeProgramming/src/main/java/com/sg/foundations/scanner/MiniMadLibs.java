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
public class MiniMadLibs {
    public static void main(String[] args) {

        String noun_1, adjective_1, noun_2, number, adjective_2, p_noun_1, p_noun_2, p_noun_3, verb_pr_tense, verb_past_tense ;
        

        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("I need a noun: ");
        noun_1 = inputReader.nextLine();
        
        System.out.println("Now an adjective: ");
        adjective_1 = inputReader.nextLine();
        
        System.out.println("Another noun: ");
        noun_2 = inputReader.nextLine();
        
        System.out.println("And a number: ");
        number = inputReader.nextLine();
        
        System.out.println("Another adjective: ");
        adjective_2 = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        p_noun_1 = inputReader.nextLine();
        
        System.out.println("Another one: ");
        p_noun_2 = inputReader.nextLine();
        
        System.out.println("One more: ");
        p_noun_3 = inputReader.nextLine();
        
        System.out.println("A verb (infinitive form): ");
        verb_pr_tense = inputReader.nextLine();
        
        System.out.println("Same verb (past participle): ");
        verb_past_tense = inputReader.nextLine();
        
        System.out.println(noun_1 + ": the " + adjective_1 + " frontier. These are the voyages of the starship " + noun_2 + ". Its " + number + "-year mission: to explore strange " + adjective_2 + " " + p_noun_1 + ", to seek out " + adjective_2 + " " + p_noun_2 + " and " + adjective_2 + " " + p_noun_3 + ", to boldly " + verb_pr_tense + " where no one has " + verb_past_tense + " before.");
        

        
    }
    
}
