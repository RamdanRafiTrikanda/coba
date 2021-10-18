/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.BangunRuangModel;
import view.FrmBangunRuang;

/**
 *
 * @author Ramdan
 */
public class BangunRuangController {
    FrmBangunRuang view;
    BangunRuangModel model;

public BangunRuangController (FrmBangunRuang view){
    this.view = view;
    model = new BangunRuangModel ();
}
 public void inputData(Double a1,Double a2, Double a3)
    {
        model.setP(a1); 
        model.setL(a2);
        model.setT(a3);
    }
    
     public double Balok() 
         {
             return model.Balok();
          }

    public double Prisma() 
         {
             return model.Prisma();
         }

    public double Limas() 
         {
            return model.Limas();
         }

    public double Tabung()
         {
            return model.Tabung();
         }
    
}