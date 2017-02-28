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
public class StartUp {
    public static void main(String[] args) {
        
        
        Input input1 = new GuiInput();
        Input input2 = new KeyboardInput();
        Output output1 = new GuiOutput();
        Output output2 = new printLineOutput();
        
        inputOutputService message1 = new inputOutputService(input2, output2);
        message1.outputMessage();
    }
}
