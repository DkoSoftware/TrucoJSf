/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TrucoJsf.Controller;

import TrucoJsf.Model.JogadorModel;
import java.io.Serializable;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author rbfz800
 */

@ManagedBean(name="jogadorController")
@SessionScoped
public class JogadorController implements Serializable{
    
    public JogadorModel ObtemPerfilJogador() {
        
        JogadorModel model = new JogadorModel();
        int round = new Random().nextInt(3);
        
        switch (round) {
            case 0:
                model.setNome("João");
                model.setSexo("M");
                model.setUrlAvatar("resources/Images/avatarM1.png");
                break;
            
            case 1:
                model.setNome("Roberto");
                model.setSexo("M");
                 model.setUrlAvatar("resources/Images/avatarM2.png");
                break;
                
            case 2:
              model.setNome("Ana");
              model.setSexo("F");
               model.setUrlAvatar("resources/Images/avatarF1.png");
              break;
                
            case 3:
              model.setNome("Jeniffer");
              model.setSexo("F");
               model.setUrlAvatar("resources/Images/avatarF2.png");
              break;
        }
        
        return model;
    }
    
    public String ObtemUrlAvatar(String avatarAdversario,String sexoJogador){
        
        String urlAvatar = "";
        
        if(sexoJogador.equals("M"))
            switch(avatarAdversario) {

                case "resources/Images/avatarM1.png":
                    urlAvatar = "resources/Images/avatarM2.png";

                case "resources/Images/avatarM2.png":
                    urlAvatar = "resources/Images/avatarM1.png";
                
                default:
                    urlAvatar = "resources/Images/avatarM1.png";
            }
        else
            switch(avatarAdversario) {
        
            case "resources/Images/avatarF1.png":
                urlAvatar = "resources/Images/avatarF2.png";

            case "resources/Images/avatarF2.png":
                urlAvatar = "resources/Images/avatarF1.png";
             
            default:
                urlAvatar = "resources/Images/avatarF1.png";
        }
        
        return urlAvatar;
    }
}
