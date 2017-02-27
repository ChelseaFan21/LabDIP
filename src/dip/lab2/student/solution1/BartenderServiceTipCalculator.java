/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;
//any concrete method should be final.
/**
 *
 * @author brandonstoiber
 */
public class BartenderServiceTipCalculator implements TipCalculator {
    private double amountPerDrink;
    private int drinkCount;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality quality;
    
    // pass the data through the constructor so you don't miss information.
    public BartenderServiceTipCalculator(double amountPerDrink, int drinkCount) {
        this.amountPerDrink = amountPerDrink;
        this.drinkCount = drinkCount;
    }
    @Override
    public final double getTip(){
     
        return amountPerDrink * drinkCount;
        
    }
    
    public final double getAmountPerDrink() {
        return amountPerDrink;
    }

    public final void setAmountPerDrink(double amountPerDrink) {
        this.amountPerDrink = amountPerDrink;
    }

    @Override
    public final double getGoodTip() {
        return 0;
    }

    @Override
    public final void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public final double getFairTip() {
        return 0;
    }

    @Override
    public final void setFairTip(double fairTip) {
        this.fairTip = fairTip;
    }

    @Override
    public final double getPoorTip() {
        return 0;
    }

    @Override
    public final void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }

    @Override
    public ServiceQuality getQuality() {
        return quality.GOOD;
    }

    @Override
    public void setQuality(ServiceQuality quality) {
       
    }
     public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

 
    
}
