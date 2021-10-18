/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ramdan
 */
public class KonversiSuhuModel {
    private double suhu;

    public double getSuhu() {
        return suhu;
    }

    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }
    public double celciuskefahrenheit() {
        return (suhu * 9/5 + 32);
    }
    
    public double fahrenheitkecelcius() {
        return (suhu - 32 * 5/9);
    }

     public double celciuskekelvin() {
        return (suhu + 273);
    }
    public double kelvinkecelcius() {
        return (suhu - 273);
    }
}
