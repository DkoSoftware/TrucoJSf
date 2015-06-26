/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TrucoJsf.Controller;

import TrucoJsf.Model.JogadorModel;
import TrucoJsf.Model.JogoModel;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.faces.bean.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import org.primefaces.event.DragDropEvent;

/**
 *
 * @author DKO
 */

@SessionScoped
@ManagedBean(name="loginController")
public class LoginController {
    
    private JogoModel jogoModel;
    private List<SelectItem> listaIdiomas;
    private List<SelectItem> bindIdiomas;

    public List<SelectItem> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(List<SelectItem> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }

    public JogoModel getJogoModel() {
        return jogoModel;
    }

    public void setJogoModel(JogoModel jogoModel) {
        this.jogoModel = jogoModel;
    }
    
    public String Login(JogadorModel model) throws IOException{
        FacesMessage msg = null;
        if(model.getNome() == null || "".equals(model.getNome()))
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Jogador","Insira um nome" );
        else if("S".equals(model.getSexo()))
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Jogador", "Selecione um sexo"); 
        
        if(msg != null)
            FacesContext.getCurrentInstance().addMessage(null, msg);
        else{
            this.jogoModel = new JogoController().ContruirJogo(model);
            return "Game?faces-foward=true";
        }
        
        return "";
    }
    
    public void LimparFormulario(){
        
    }
    
    public void ExecutaJogada(DragDropEvent ddEvent){
        this.jogoModel.getJogadores().get(1).setNome("Foi alterado");
    }
    
    public List<SelectItem> getBindIdiomas() {
        if (listaIdiomas == null) {
            listaIdiomas = new ArrayList<>();
            listaIdiomas.add(new SelectItem(1, "Português"));
            listaIdiomas.add(new SelectItem(2, "Spanish"));
        }
        return listaIdiomas;
    }

    //LISTENER
    public void mudaPais(ActionEvent event){
        // Descobrir o contexto da aplicação para porterior
        // troca de idioma
        FacesContext context = FacesContext.getCurrentInstance();
        
        String componente = event.getComponent().getId();
        
        switch (componente) {
            case "brasil" :
                context.getViewRoot().setLocale(new Locale("pt", "BR"));
                break;
            case "usa" :
                context.getViewRoot().setLocale(Locale.ENGLISH);
                break;
        }
    }
}
