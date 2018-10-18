package br.com.fatecitu.helpdesk.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fatecitu.helpdesk.dao.LaboratorioDAO;
import br.com.fatecitu.helpdesk.model.Laboratorio;


@ViewScoped
@ManagedBean(name = "LaboratorioBean", eager = true)
public class LaboratorioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Laboratorio laboratorio = new Laboratorio();
	LaboratorioDAO laboratorioDao = new LaboratorioDAO();
	
	public void cadastrarLaboratorio() {
		laboratorioDao.salvar(laboratorio);
	}
	
	public void editarLaboratorio() {
		laboratorioDao.alterar(laboratorio);
	}
	
	public void excluirLaboratorio() {
		laboratorioDao.excluir(laboratorio);
	}
	
	public List<Laboratorio> consultarLaboratorio(){
		List<Laboratorio> laboratorios = new ArrayList();
		
		return laboratorios;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	
	
	
}
