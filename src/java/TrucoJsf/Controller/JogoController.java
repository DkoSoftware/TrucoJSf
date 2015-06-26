package TrucoJsf.Controller;

import TrucoJsf.Model.CartaModel;
import TrucoJsf.Model.JogadorModel;
import TrucoJsf.Model.JogoModel;
import TrucoJsf.Model.PartidaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author Riguel Figueiro
 */


@SessionScoped
@ManagedBean(name="jogoController")
public class JogoController implements Serializable {
    
    private JogoModel model;
    
    @ManagedProperty(value="#{loginController}")
    private LoginController ctrl;

    public JogoController(){
    }
    
    public JogoModel getModel() {
        return model;
    }

    public void setModel(JogoModel model) {
        this.model = model;
    }

    public LoginController getCtrl() {
        return ctrl;
    }

    public void setCtrl(LoginController ctrl) {
        this.ctrl = ctrl;
    }
    
  
    public JogoModel ContruirJogo(JogadorModel modelJogador){
        List<JogadorModel> listaJogadores = new ArrayList<JogadorModel>();
        this.model = new JogoModel();
        
        //jogador computador
        JogadorModel jogadorComputador = CriaJogadorAdversario();
        
        listaJogadores.add(jogadorComputador);
        //jogador logado
        modelJogador.setMao(new CartaController().ObtemCartasJogador());
        modelJogador.setUrlAvatar(new JogadorController().ObtemUrlAvatar(jogadorComputador.getUrlAvatar(),modelJogador.getSexo()));
        modelJogador.setPontos(0);
        listaJogadores.add(modelJogador);
        
        this.model.setJogadores(listaJogadores);
        this.model.setPartida(new PartidaModel());
        return this.model;
    }
    
    private JogadorModel CriaJogadorAdversario(){
        
        //cria jogador computador
        JogadorModel jogadorComputador = new JogadorController().ObtemPerfilJogador();
        jogadorComputador.setMao(new CartaController().ObtemCartasJogador());
        jogadorComputador.setPontos(0);

        return jogadorComputador; 
    }
    
    public void ObtemCartasJogadas(){
        
    }
    
    // jogadas computador ///////////////////////
    
    
    
    
    
    // jogadas jogador ///////////////////////
    public void RealizaJogada(DragDropEvent ddEvent) {
        //CartaModel carta = ((CartaModel) ddEvent.getData());
  
       // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Jogada do jogador", "jogada realizada"));
        //ctrl.getJogoModel().getPartida().getCartasJogadas().add(carta);
        //ctrl.getJogoModel().getJogadores().get(1).getMao().remove(carta);
    }
    
    public void RealizadaTruco(){
    }
    
    public void RealizadaReTruco(){
    }
    
    public void RealizadaValeSeis(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Jogada Vale 6", "jogada realizada"));
    }
    
    public void RealizadaEnvido(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Jogada Envido", "jogada realizada"));
    }
    
    public void RealizadaRealEnvido(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Jogada Real Envido", "jogada realizada"));
    }
            
    public void RealizadaFaltaEnvido(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Jogada Falta Envido", "jogada realizada"));
    }
    
    public void RealizadaFlor(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Jogada Flor", "jogada realizada"));
    }
}
