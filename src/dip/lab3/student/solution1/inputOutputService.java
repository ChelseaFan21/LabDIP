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
public class inputOutputService {
    private Input newInput;
    private Output newOutput;

    public inputOutputService(Input newInput, Output newOutput) {
        this.newInput = newInput;
        this.newOutput = newOutput;
    }

    public void outputMessage(){
        newOutput.outputMessage(newInput);
    }
    
}
