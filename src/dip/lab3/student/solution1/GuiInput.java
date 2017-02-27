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
public class GuiInput implements Reader{
    private String message;
    
    @Override
    public final String inputMessage() {
        System.out.println("Enter your message.");
        message = javax.swing.JOptionPane.showInputDialog(" enter your text ");
        return message;
    }
    

}
