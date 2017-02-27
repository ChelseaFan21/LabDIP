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
public class FoodServiceTipCalculator implements TipCalculator {
    private double billAmt;
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality quality;
    
    // pass the data through the constructor so you don't miss information.
    public FoodServiceTipCalculator(double billAmt, ServiceQuality quality) {
        this.billAmt = billAmt;
        this.quality = quality;
    }
    @Override
    public final double getTip(){
        double tip = 0;
        switch(quality){
            case GOOD:
                // best practice don't use multiple return statements.
                tip = billAmt * goodTip;
                break;
            case FAIR:
                tip = billAmt * fairTip;
                break;
            case POOR:
                tip = billAmt * poorTip;
                break;       
        }
        return tip;
        
    }
    
    public final double getBillAmt() {
        return billAmt;
    }

    public final void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
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

 
    
}
