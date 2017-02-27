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
public class StartUp {
    public static void main(String[] args) {
        // always perform intitialization of worker objects first
        // left side needs to be the abstraction
        TipCalculator calc = new BaggageServiceTipCalculator(1, 5, ServiceQuality.GOOD);
        TipCalculator calc2 = new FoodServiceTipCalculator(100.00, ServiceQuality.GOOD);
        TipCalculator calc3 = new BartenderServiceTipCalculator(1, 10);
        
        TipCalculatorService service = new TipCalculatorService(calc);
        
        //never talk directly to low level object, only high level object.
        double tip = service.getTip();
        System.out.println(tip);
    }
}
