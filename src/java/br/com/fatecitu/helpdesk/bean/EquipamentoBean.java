/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecitu.helpdesk.bean;

import br.com.fatecitu.helpdesk.model.Equipamentos;
import br.com.fatecitu.helpdesk.dao.EquipamentoDAO;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno - Gti-Ads
 */
@ViewScoped
@ManagedBean(name = "equipamentoBean", eager = true)
public class EquipamentoBean implements Serializable{
    
    Equipamentos equipamentos = new Equipamentos();
    EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
    

    public void cadastrarEquipamento(){
        //TODO: cadastrar equipamento
        equipamentoDAO.salvar(equipamento);
    }
    
    public void editarEquipamento(){
        //TODO: editar equipamento
        equipamentoDAO.editar(equipamento);
    }
    
    public void excluirUsuario(){
        //TODO: excluir equipamento
        equipamentoDAO.excluir(equipamento);
    }
    
    public List<Equipamento> consultarEquipamento(){
        //TODO: consultar equipamento
        List<Equipamento> equipamentos = new ArrayList();
        
        return equipamento;        
    }
    
    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
	
}
