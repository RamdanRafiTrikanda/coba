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
public class KalkulatorModel {
    private double nilai1;
    private double nilai2;

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }
     public double tambah() {
        return (nilai1 + nilai2);
    }
    
    public double kurang() {
        return (nilai1 - nilai2);
    }

     public double kali() {
        return (nilai1 * nilai2);
    }
    public double bagi() {
        return (nilai1 / nilai2);
    }
}
