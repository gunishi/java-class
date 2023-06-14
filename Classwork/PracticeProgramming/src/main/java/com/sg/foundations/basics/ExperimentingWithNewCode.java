/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics;

import java.util.Random;

/**
 *
 * @author gunishinathoo
 */
public class ExperimentingWithNewCode {
    
    public static void main(String[] args) {
        
        Random fixedSeed = new Random(10);
        Random timeSeed = new Random();
        
        System.out.println(fixedSeed);
        System.out.println(timeSeed);
        
    }
    
}
