package TrucoJsf.Model;

import java.util.List;
import javax.faces.bean.ManagedBean;

 /*
 * @author Riguel Figueiro
 */

@ManagedBean(name="jogadorModel")
public class JogadorModel {
    
    private String Nome;
    private String Sexo;
    private List<CartaModel> Mao;
    private int Pontos;
    private String UrlAvatar;

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getUrlAvatar() {
        return UrlAvatar;
    }

    public void setUrlAvatar(String UrlAvatar) {
        this.UrlAvatar = UrlAvatar;
    }

    public int getPontos() {
        return Pontos;
    }

    public void setPontos(int Pontos) {
        this.Pontos = Pontos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<CartaModel> getMao() {
        return Mao;
    }

    public void setMao(List<CartaModel> Mao) {
        this.Mao = Mao;
    }
}
