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
public class MiniZork {
    
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here along with a cave.");
        System.out.println("Go to the house, go to the cave, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } 
            
            else if (action.equals("stick your hand in")) { 
                System.out.println("You stick your hand in...");
                System.out.println("Why on Earth did you do that?");
                System.out.println("Everyone knows that's where the demons hide...");
            }
        } 
        else if (action.equals("go to the house")) { 
            System.out.println("The lights are off.");
            System.out.println("It's really dark in there.");
            System.out.println("Turn the lights on or brave it in the dark? ");
            action = userInput.nextLine();
            
            if (action.equals("turn the lights on")) {
                System.out.println("You peer inside house.");
                System.out.println("Why are there dolls everywhere?.");
                System.out.println("Investigate the dolls or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around creepy places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("investigate the dolls")) {
                    System.out.println("You investigate the dolls and move them around....");
                    System.out.println("...when you see one move out of the corner of your eye... too late, you're dead.");
                }
            }
            else if (action.equals("brave it in the dark")){
                System.out.println("You tip toe in the dark.");
                System.out.println("What is that on the floor? Blood?.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around creepy places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run at full pelt out of the house...");
                    System.out.println("...but are caught in the front yard... alas the Grue has won...");
                }
                
            }
        }
        
        else if (action.equals("go to the cave")){
            System.out.println("It's cold and wet in here.");
            System.out.println("Ooof I think that's a rat and I'm terrified of them!");
            System.out.println("Use the rat poison or go on?");
            action = userInput.nextLine();
            
            if (action.equals("go on")) {
                System.out.println("Okay, let's push on but light a match");
                System.out.println("You light the match but something behind you blows the match out");
                System.out.println("Turn and run or confront the being?");
                action = userInput.nextLine();
                
                if (action.equals("turn and run")) {
                    System.out.println("You turn and run as fast as you can");
                    System.out.println("But it isn't quick enough and the being pulls you in the cave...");
                    System.out.println("...Never to be seen again");
                } else if (action.equals("confront the being")) {
                    System.out.println("This is your moment, draw the sword and slay the beast!");
                    System.out.println("You did it! You beat the Grue and have one the bounty on his head!");
                    
                }
                
                
            }
            
            else if (action.equals("use the rat poison")){
                System.out.println("You choose to use the rat poison...");
                System.out.println("...but unbeknownst to you, this is no rat, it is a Grue");
                System.out.println("And just like that the Grue is the victor, living to eat another bounty hunter another day.");
            }
        }
    }
    
}

