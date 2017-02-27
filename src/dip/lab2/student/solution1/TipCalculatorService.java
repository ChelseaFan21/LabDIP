/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author brandonstoiber
 */
// this is the boss need to give orders to the worker.
// this makes the other tip calculators portable. 
public class TipCalculatorService {
    private TipCalculator tipCalculator;
    // forces you to call the setter method.  
    public TipCalculatorService(TipCalculator tipCalculator) {
       this.setTipCalculator(tipCalculator);
   }
    //service isn't doing this TipCalculator is.
    public double getTip(){
        return tipCalculator.getTip();
    }

    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }
    //remember to validate these. 
    public final void setTipCalculator(TipCalculator tipCalculator) {
        if(tipCalculator == null){
            throw new IllegalArgumentException("tip calculator is mandatory.");
        }
        this.tipCalculator = tipCalculator;
    }
    
    
}
