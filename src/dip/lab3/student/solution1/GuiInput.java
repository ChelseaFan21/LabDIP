/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author brandonstoiber
 */
public class GuiInput implements Input{
    private String message;
    
    @Override
    public final String getInputMessage() {
        System.out.println("Enter your message.");
        // should allow a pop up box to enter a message.
        message = javax.swing.JOptionPane.showInputDialog(" enter your text ");
        return message;
    }
    

}
