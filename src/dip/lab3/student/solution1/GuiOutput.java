/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author brandonstoiber
 */
public class GuiOutput implements Output{
    
    public final void outputMessage(Input inputMessage) {
    JOptionPane.showMessageDialog(null, inputMessage.getInputMessage());
}

   
}
