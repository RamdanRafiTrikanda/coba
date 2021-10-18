/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import model.LoginModel;
import view.FrmLogin;
import view.FrmMain;
/**
 *
 * @author ASUS
 */
public class LoginController 
{
        LoginModel model;
     FrmLogin view;
    
     public LoginController(FrmLogin view){
       this.view = view;
       model = new LoginModel();
     }
     
     public void inputData(String username, String password){
         model.setUsername(username);
         model.setPassword(password);
     }
     public String cekData(){
         if(model.getUsername().equals("Triyanto") &&
            model.getPassword().equals("ondot")){
             JOptionPane.showMessageDialog(null, "Login Berhasil");
         }else{
             JOptionPane.showMessageDialog(null, "Login Gagal");
         }
        return null;
     }
}
