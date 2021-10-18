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
public class BangunRuangModel {
   private Double  p,l,t;
    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    public double Balok()
      {
            return (2 * (p*l + p*l+ l*t));              
      }
    public double Prisma()
      {
            return ((p*t) + (2 *p));     
      }
     public double Limas()
      {
            return (p + (l * 4));              
      }
      public double Tabung()
      {
            return (2 * 3.14 * p * ( p * l));              
      }
}
