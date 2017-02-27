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
public interface TipCalculator {

    double getFairTip();

    double getGoodTip();

    double getPoorTip();

    ServiceQuality getQuality();

    double getTip();

    void setFairTip(double fairTip);

    void setGoodTip(double goodTip);

    void setPoorTip(double poorTip);

    void setQuality(ServiceQuality quality);
    
}
