/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author brandonstoiber
 */
public class KeyboardInput implements Input{
    // stores keyboard input from the user.  
    @Override
    public final String getInputMessage(){
    System.out.println("Please enter the message you wish to store.");
    Scanner keyboard = new Scanner(System.in);
    return keyboard.nextLine();
    }
}
