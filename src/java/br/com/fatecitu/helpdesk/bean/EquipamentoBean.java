package br.com.fatecitu.helpdesk.bean;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ViewScoped;

import br.com.fatecitu.helpdesk.Equipamento;
import br.com.fatecitu.helpdesk.dao.EquipamentoDAO;

@ViewScoped
@ManagedBean(name = "equipamentoBean", eager = true)
public class EquipamentoBean {
    Equipamento equipamento = new Equipamento();
    EquipamentoDAO equipamentodao = new EquipamentoDAO();

    private List<Equipamento> listEquipamento = new ArrayList<Equipamento>();

    public void addCodEquipamento(){
        this.listEquipamento.add(this.equipamento);
        this.equipamento = new Equipamento();
    }
    public List<Equipamento> getEquipamentos(){
        return this.listEquipamento;
    }
    
    public List<Equipamento> recuperaCodEquipamento(int cod){
        
        for(Equipamento equipamentos:listEquipamento){
            if(equipamentos.getCodEquipamento() == cod){
                return listEquipamento;
            }
            else{
                return null;
            }
        }
        return listEquipamento;
    }
    
    
    public void cadastrarEquipamento() {
        //equipamentodao.salvar(equipamento);
    }
	
    public void editarEquipamento(Equipamento equipamento){
        // equipamentodao.editar(equipamento);
    }
    
    public void excluirUsuario(Equipamento equipamento){
        //equipamentodao.excluir(equipamento);
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
}