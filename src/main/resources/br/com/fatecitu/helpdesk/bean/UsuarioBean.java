package br.com.fatecitu.helpdesk.bean;

import br.com.fatecitu.helpdesk.model.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Erick
 */

@ViewScoped
@ManagedBean(name = "usuarioBean", eager = true)
public class UsuarioBean implements Serializable{
    Usuario usuario = new Usuario();

    public void exibirUsuario(){
        System.out.println(usuario);
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Senha: " + usuario.getSenha());
    }
    
    public String print(){
        return "Funcionando";
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
