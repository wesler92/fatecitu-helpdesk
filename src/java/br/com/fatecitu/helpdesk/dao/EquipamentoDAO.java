package br.com.fatecitu.helpdesk.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fatecitu.helpdesk.Equipamento;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EquipamentoDAO {
    
    /*private static Connection conexao;
    private static final String URL_CONEXAO = "";
    private static final String USUARIO = "";
    private static final String SENHA = "";

    public static Connection getConexao() {
        if(conexao == null){
            try {
                Class.forName(className);
                conexao = DriverManager.getConnection(null);
            } catch (SQLException ex) {
                Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexao;
    }*/
    
    public void salvar(Equipamento equipamento){
        //TODO: salvar o usu�rio
    }
	    
    public void editar(Equipamento equipamento){
        //TODO: edita o usu�rio
    }

    public void excluir(Equipamento equipamento){
        //TODO: exclui o usu�rio
    }

    public List<Equipamento> consultar(){
        //TODO: consulta os usu�rios
        List<Equipamento> equipamentos = new ArrayList<Equipamento>();

        return equipamentos;
    }
}

