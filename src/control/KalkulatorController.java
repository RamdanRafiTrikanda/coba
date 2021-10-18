/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.KalkulatorModel;
import view.FrmKalkulator;



/**
 *
 * @author Ramdan
 */
public class KalkulatorController {
    FrmKalkulator view;
    KalkulatorModel model;

public KalkulatorController(FrmKalkulator view)
    {
    this.view = view;
    model = new KalkulatorModel();
    }
public void inputNilai(Double n1, Double n2)
    {
        model.setNilai1(n1);
        model.setNilai2(n2);
    }
public double tambah()
    {
        return model.tambah();
    }

public double kurang()
    {
        return model.kurang();
    }
public double kali()
    {
        return model.kali();
    }
public double bagi()
    {
        return model.bagi();
    }
}