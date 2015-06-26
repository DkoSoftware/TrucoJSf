/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TrucoJsf.Model;

import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Riguel Figueiro
 */
@ManagedBean(name="partidaModel")
public class PartidaModel {
    private List<CartaModel> CartasJogadas;
    private int Pontos = 0;
    private boolean Truco = false;
    private boolean Retruco = false;
    private boolean Vale6 = false;
    private boolean Envido = false;

    public List<CartaModel> getCartasJogadas() {
        return CartasJogadas;
    }

    public void setCartasJogadas(List<CartaModel> CartasJogadas) {
        this.CartasJogadas = CartasJogadas;
    }

    public int getPontos() {
        return Pontos;
    }

    public void setPontos(int Pontos) {
        this.Pontos = Pontos;
    }

    public boolean isTruco() {
        return Truco;
    }

    public void setTruco(boolean Truco) {
        this.Truco = Truco;
    }

    public boolean isRetruco() {
        return Retruco;
    }

    public void setRetruco(boolean Retruco) {
        this.Retruco = Retruco;
    }

    public boolean isVale6() {
        return Vale6;
    }

    public void setVale6(boolean Vale6) {
        this.Vale6 = Vale6;
    }

    public boolean isEnvido() {
        return Envido;
    }

    public void setEnvido(boolean Envido) {
        this.Envido = Envido;
    }

    public boolean isRealEnvido() {
        return RealEnvido;
    }

    public void setRealEnvido(boolean RealEnvido) {
        this.RealEnvido = RealEnvido;
    }

    public boolean isFaltaEnvido() {
        return FaltaEnvido;
    }

    public void setFaltaEnvido(boolean FaltaEnvido) {
        this.FaltaEnvido = FaltaEnvido;
    }

    public boolean isFlor() {
        return Flor;
    }

    public void setFlor(boolean Flor) {
        this.Flor = Flor;
    }
    private boolean RealEnvido;
    private boolean FaltaEnvido;
    private boolean Flor;
}
