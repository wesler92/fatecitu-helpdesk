/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecitu.helpdesk.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import br.com.fatecitu.helpdesk.model.Equipamentos;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Aluno - Gti-Ads
 */
public class EquipamentoDAO {
	
	private Connection conn;
	private ResultSet rs;

    public EquipamentoDAO(Connection conn) {
		this.conn = conn;
        //this.conn = new ConnectionFactory().getConnetion();
		
    }	
	
    public void salvar(Equipamentos equipamento){
        //TODO: salvar o equipamento
		Strinig inserir = "insert into equipamentos(tipo, descricao, codLaboratorio) values(/,?,?)";
		try{
			PreparedStatement ps = conn.prepareStatement(inserir);
			ps.setString(1, equipamento.getTipo());
			ps.setString(2, equipamento.getDescricao());
			ps.setString(3, equipamento.getCodLaboratorio());
			ps.execute();
			ps.close();
		}catch(SQLException erro){
			throw new RunTimeException(erro);
		}
	}
    
    public void editar(Equipamentos equipamento){
        //TODO: edita o equipamento
		
		Strinig atualizar = "update equipamentos set tipo=?, descricao=?, doLaboratorio=? where codEquipamento = ?";
		try{
			PreparedStatement ps = conn.prepareStatement(atualizar);
			ps.setString(1, equipamento.getTipo());
			ps.setString(2, equipamento.getDescricao());
			ps.setString(3, equipamento.getCodLaboratorio());
			ps.execute();
			ps.close();
		}catch(SQLException erro){
			throw new RunTimeException(erro);
		}
    }
    
    public void excluir(Equipamentos equipamento){
        //TODO: exclui o equipamento
    }
    
    public List<Equipamentos> consultar(){
        //TODO: consulta os equipamento
        List<Equipamentos> equipamentos = new ArrayList<Equipamentos>();
		
		
		this.ps = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        this.rs = ps.executeQuery("selet * from equipamentos");
		
        return equipamentos;
    }
}
