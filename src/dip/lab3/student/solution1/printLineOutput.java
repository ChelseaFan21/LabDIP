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
public class printLineOutput implements Output{

    
    public final void outputMessage(Input inputMessage){
        System.out.println(inputMessage.getInputMessage());
    }
}
