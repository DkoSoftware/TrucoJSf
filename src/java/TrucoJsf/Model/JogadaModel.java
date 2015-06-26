package TrucoJsf.Model;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 *
 * @author Riguel Figueiro
 */

@Named("jogadaModel")
public class JogadaModel {
    
    public enum TipoJogada{
        Truco,
        Retruco,
        ValeQuatro,
        Envido,
        Realenvido,
        FaltaEnvido,
        Flor
    }
}
