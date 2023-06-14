/**
 *
 * @author gunishinathoo
 * email:gunishinathoo@gmail.com
 * date: 13/06/23
 * purpose: a program to calculate the replacement cost of windows
 */

package com.jgn.windowmaster;
import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        //declare variables for height and width
        float height;
        float width;
        
        //declare String variables to hold the user's height and width input
        String stringHeight;
        String stringWidth;
        
        //declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float glassCost;
        float trimCost;
        
        //initialise glass and trim costs as they are constants
        
        glassCost = 3.5f;
        trimCost = 2.25f;
        
        // declare and initialise the Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please input window height in feet:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please input window width in feet:");
        stringWidth = myScanner.nextLine();

        //convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        //calculate area of window
        areaOfWindow = height * width;

        //calculate perimeter of window
        perimeterOfWindow = 2 * (height + width);
        
        //calculate total cost
        cost = ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow));

        //display results to user
        System.out.println("Window height in feet = " + stringHeight);
        System.out.println("Window width in feet = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);

    }
    
}
