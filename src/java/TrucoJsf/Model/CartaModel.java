/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TrucoJsf.Model;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author rbfz800
 */

@ManagedBean(name="cartaModel")
public class CartaModel {
    
    private int Id;
    private String Nome;
    private int Valor;
    private String urlImagem;
    private String MostrarCarta = "block";

    public String getMostrarCarta() {
        return MostrarCarta;
    }

    public void setMostrarCarta(String MostrarCarta) {
        this.MostrarCarta = MostrarCarta;
    }
    

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
}
