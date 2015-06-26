
package TrucoJsf.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 *
 * @author DKO
 */
@ManagedBean(name="jogoModel")
public class JogoModel{
    
    private List<JogadorModel> Jogadores;
    private PartidaModel Partida;

    public PartidaModel getPartida() {
        return Partida;
    }

    public void setPartida(PartidaModel Partida) {
        this.Partida = Partida;
    }
    
    public JogoModel(){
        this.Jogadores = new ArrayList<JogadorModel>();
    }
    
    public List<JogadorModel> getJogadores() {
        return Jogadores;
    }

    public void setJogadores(List<JogadorModel> jogadores) {
        this.Jogadores = jogadores;
    }
}
