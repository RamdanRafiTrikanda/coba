/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.BiodataModel;
import view.FrmBiodata;


/**
 *
 * @author Ramdan
 */
public class BiodataController {
    BiodataModel model;
    FrmBiodata view;
    
    public BiodataController(FrmBiodata view) {
        this.view = view;
        model = new BiodataModel();
    }
    //method untuk input data
    public void inputData(String nim, String nama,
                          String jk, String jurusan, 
                          String kelas){
        model.setNim(nim);
        model.setNama(nama);
        model.setJenisKelamin(jk);
        model.setJurusan(jurusan);
        model.setKelas(kelas);
    }
    //method untuk menampilkan data
    public String tampilData(){
        String keterangan = "";
        if(model.getJenisKelamin().equals("L")){
            keterangan = "Sdr.";
        }else{
            keterangan = "Sdri.";
        }
        
        return keterangan + " " +
                model.getNama() +
                "\nNim : " + model.getNim() +
                "\nJurusan : " + model.getJurusan() +
                "\nKelas : " + model.getKelas();
    }
}
