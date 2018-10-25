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

/**
 *
 * @author Aluno - Gti-Ads
 */
@ViewScoped
@ManagedBean(name = "usuarioBean", eager = true)
public class EquipamentoBean implements Serializable{
    
    Equipamentos equipamentos = new Equipamentos();
    EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
    
}
