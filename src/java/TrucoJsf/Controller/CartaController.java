package TrucoJsf.Controller;

import TrucoJsf.Model.CartaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Riguel Figueiro
 */

@ManagedBean(name="cartaController")
@SessionScoped
public class CartaController implements Serializable{
   
    public List<CartaModel> ObtemCartasJogador() {
        
        List<CartaModel> cartas = new ArrayList<CartaModel>();
        for (int i = 0; i < 3; i++) {
            CartaModel carta = new CartaModel();
            int round = new Random().nextInt(34) + 1;
            cartas.add(ObtemCarta(round));
        }
        
        return cartas;
    }
    
    private CartaModel ObtemCarta(int valorCarta){
        CartaModel model = new CartaModel();
        switch(valorCarta) {
        
            case 35:
                model.setNome("1E");
                model.setValor(17);
                break;

            case 34:
                model.setNome("1P");
                model.setValor(16);
                break;
            
            case 33:
                model.setNome("7E");
                model.setValor(15);
                break;
            
            case 32:
                model.setNome("7O");
                model.setValor(14);
                break;

            case 31:
                model.setNome("3P");
                model.setValor(13);
                break;
            
            case 30:
                model.setNome("3O");
                model.setValor(13);
                break;
            
            case 29:
                model.setNome("3E");
                model.setValor(13);
                break;

            case 28:
                model.setNome("2P");
                model.setValor(12);
                break;
            
            case 27:
                model.setNome("2O");
                model.setValor(12);
                break;
                
            case 26:
                model.setNome("2C");
                model.setValor(12);
                break;

            case 25:
                model.setNome("2E");
                model.setValor(12);
                break;
            
            case 24:
                model.setNome("1O");
                model.setValor(11);
                break;
                
            case 23:
                model.setNome("1C");
                model.setValor(11);
                break;

            case 22:
                model.setNome("12P");
                model.setValor(10);
                break;
                
            case 21:
                model.setNome("12O");
                model.setValor(10);
                break;
                
            case 20:
                model.setNome("12C");
                model.setValor(10);
                break;
            
            case 19:
                model.setNome("12E");
                model.setValor(10);
                break;
                
            case 18:
                model.setNome("11P");
                model.setValor(9);
                break;
                
            case 17:
                model.setNome("11O");
                model.setValor(9);
                break;
                
            case 16:
                model.setNome("11C");
                model.setValor(9);
                break;
            
            case 15:
                model.setNome("11E");
                model.setValor(9);
                break;
                
            case 14:
                model.setNome("7P");
                model.setValor(8);
                break;
            
            case 13:
                model.setNome("7C");
                model.setValor(8);
                break;
                
            case 12:
                model.setNome("6P");
                model.setValor(7);
                break;
                
            case 11:
                model.setNome("6O");
                model.setValor(7);
                break;
                
            case 10:
                model.setNome("6C");
                model.setValor(7);
                break;
            
            case 9:
                model.setNome("6E");
                model.setValor(7);
                break;
            
             case 8:
                model.setNome("5P");
                model.setValor(6);
                break;
                
            case 7:
                model.setNome("5O");
                model.setValor(6);
                break;
                
            case 6:
                model.setNome("5C");
                model.setValor(6);
                break;
            
            case 5:
                model.setNome("5E");
                model.setValor(6);
                break;
                
             case 4:
                model.setNome("4P");
                model.setValor(5);
                 break;
                
            case 3:
                model.setNome("4O");
                model.setValor(5);
                break;
                
            case 2:
                model.setNome("4C");
                model.setValor(5);
                break;
            
            case 1:
                model.setNome("4E");
                model.setValor(5);
                break;
        }
        
        model.setUrlImagem("Images/" + model.getNome() + ".png");
        
        return model;
    }
}
