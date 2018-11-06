package br.com.fatecitu.helpdesk.bean;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;

import br.com.fatecitu.helpdesk.dao.EquipamentoDAO;
import br.com.fatecitu.helpdesk.model.Equipamento;

@ViewScoped
@ManagedBean(name = "equipamentoBean", eager = true)
public class EquipamentoBean {
	Equipamento equipamento = new Equipamento();
	EquipamentoDAO equipamentodao = new EquipamentoDAO();
	
	private List<Equipamento> listEquipamento = new ArrayList<Equipamento>();
	
	public List<Equipamento> addCodEquipamento(List lstEquipamentos){
		lstEquipamentos.add(this.equipamento.getCodEquipamento());
		return lstEquipamentos;
	}
	public void cadastrarEquipamento() {
		//equipamentodao.salvar(equipamento);
		listEquipamento.add(equipamento);
		
		addCodEquipamento(listEquipamento);
	}
	
	public void editarEquipamento(Equipamento equipamento){
        equipamentodao.editar(equipamento);
    }
    
    public void excluirUsuario(Equipamento equipamento){
        equipamentodao.excluir(equipamento);
    }

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
    
}