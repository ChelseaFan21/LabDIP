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
    
    public inputOutputService(Input newInput, Output newOutput){
        setNewInput(newInput);
        setNewOutput(newOutput);
    }

    public final Input getNewInput() {
        return newInput;
    }

    public final void setNewInput(Input newInput) {
        this.newInput = newInput;
    }

    public final Output getNewOutput() {
        return newOutput;
    }

    public final void setNewOutput(Output newOutput) {
        this.newOutput = newOutput;
    }
    public final void inputOutputMessage(){
        getNewInput();
        getNewOutput();
    }
    
}
