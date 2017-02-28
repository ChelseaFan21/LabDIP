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
    Scanner keyboard = new Scanner(System.in);
    private String inputMessage;
    // stores keyboard input from the user.  

   

    @Override
    public final String getInputMessage() {
        return inputMessage;
    }
    @Override
    public final void setInputMessage() {
        this.inputMessage = keyboard.nextLine();
    }

   
  
}
