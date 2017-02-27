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
public class BaggageServiceTipCalculator implements TipCalculator {
    private double baseRate;
    private int bagCount;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality quality;
    
    // pass the data through the constructor so you don't miss information.
    public BaggageServiceTipCalculator(double baseRate, int bagCount, ServiceQuality quality) {
        this.baseRate = baseRate;
        this.quality = quality;
        this.bagCount = bagCount;
    }
    @Override
    public final double getTip(){
        double tip = 0;
        switch(quality){
            case GOOD:
                // best practice don't use multiple return statements.
                tip = baseRate * bagCount *goodTip;
                break;
            case FAIR:
                tip = baseRate * bagCount * fairTip;
                break;
            case POOR:
                tip = baseRate * bagCount * poorTip;
                break;       
        }
        return tip;
        
    }
    
    public final double getBaseRate() {
        return baseRate;
    }

    public final void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    @Override
    public final double getGoodTip() {
        return goodTip;
    }

    @Override
    public final void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public final double getFairTip() {
        return fairTip;
    }

    @Override
    public final void setFairTip(double fairTip) {
        this.fairTip = fairTip;
    }

    @Override
    public final double getPoorTip() {
        return poorTip;
    }

    @Override
    public final void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }

    @Override
    public ServiceQuality getQuality() {
        return quality;
    }

    @Override
    public void setQuality(ServiceQuality quality) {
        this.quality = quality;
    }
     public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

 
    
}
