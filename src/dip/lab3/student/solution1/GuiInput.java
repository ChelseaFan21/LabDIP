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
    private String inputMessage;
    
    @Override
    public String getInputMessage() {
        return inputMessage;
    }
    
    @Override
    public void setInputMessage() {
        this.inputMessage = javax.swing.JOptionPane.showInputDialog(" enter your text ");;
    }
    
    
    

}
