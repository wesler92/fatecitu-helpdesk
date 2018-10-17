package br.com.fatecitu.helpdesk.bean;

import br.com.fatecitu.helpdesk.dao.UsuarioDAO;
import br.com.fatecitu.helpdesk.model.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    UsuarioDAO usuarioDao = new UsuarioDAO();

    public void cadastrarUsuario(){
        //TODO: cadastrar usuario
        usuarioDao.salvar(usuario);
    }
    
    public void editarUsuario(){
        //TODO: editar usuario
        usuarioDao.editar(usuario);
    }
    
    public void excluirUsuario(){
        //TODO: excluir usuario
        usuarioDao.excluir(usuario);
    }
    
    public List<Usuario> consultarUsuario(){
        //TODO: consultar usuario
        List<Usuario> usuarios = new ArrayList();
        
        return usuarios;        
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
