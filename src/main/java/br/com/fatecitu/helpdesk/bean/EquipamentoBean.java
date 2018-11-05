package br.com.fatecitu.helpdesk.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fatecitu.helpdesk.dao.EquipamentoDAO;
import br.com.fatecitu.helpdesk.model.Equipamento;

@ViewScoped
@ManagedBean(name = "equipamentoBean", eager = true)
public class EquipamentoBean {
	Equipamento equipamento = new Equipamento();
	EquipamentoDAO equipamentodao = new EquipamentoDAO();
	
	public void cadastrarEquipamento(Equipamento equipamento) {
		equipamentodao.salvar(equipamento);
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