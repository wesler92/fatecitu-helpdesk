/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecitu.helpdesk;

/**
 *
 * @author Bruno
 */
public class Equipamento {
    private int codEquipamento;
    private String tipo;
    private String descricao;
    private int codLaboratorio;
    
    
    public int getCodEquipamento() {
        return codEquipamento;
    }
    public void setCodEquipamento(int codEquipamento) {
        this.codEquipamento = codEquipamento;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCodLaboratorio() {
        return codLaboratorio;
    }
    public void setCodLaboratorio(int codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codEquipamento;
        result = prime * result + codLaboratorio;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
                return true;
        if (obj == null)
                return false;
        if (getClass() != obj.getClass())
                return false;
        Equipamento other = (Equipamento) obj;
        if (codEquipamento != other.codEquipamento)
                return false;
        if (codLaboratorio != other.codLaboratorio)
                return false;
        if (descricao == null) {
                if (other.descricao != null)
                        return false;
        } else if (!descricao.equals(other.descricao))
                return false;
        if (tipo == null) {
                if (other.tipo != null)
                        return false;
        } else if (!tipo.equals(other.tipo))
                return false;
        return true;
    }
    @Override
    public String toString() {
            return "Equipamento [codEquipamento=" + codEquipamento + ", tipo=" + tipo + ", descricao=" + descricao
                            + ", codLaboratorio=" + codLaboratorio + "]";
    }
    
}
