/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.KonversiSuhuModel;
import view.FrmKonversiSuhu;

/**
 *
 * @author Ramdan
 */
public class KonversiSuhuController {
    FrmKonversiSuhu view;
    KonversiSuhuModel model;

   public KonversiSuhuController (FrmKonversiSuhu view){
       this.view = view;
       model = new KonversiSuhuModel ();
   }
   public void Tampildata (Double suhu) {
       model.setSuhu(suhu);
   }
   public double celciuskefahrenheit()
   {
       return model.celciuskefahrenheit();
   }
   public double fahrenheitkecelcius()
   {
       return model.fahrenheitkecelcius();
   }
   public double celciuskekelvin(){
       return model.celciuskekelvin();
   }
   public double kelvinkecelcius(){
       return model.kelvinkecelcius();
   }
}
      
   
   
   
