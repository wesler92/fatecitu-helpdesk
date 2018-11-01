/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecitu.helpdesk.model;

/**
 *
 * @author Aluno - Gti-Ads
 */
public class Equipamentos {
    private int codEquipamento;
    private String tipo;
    private String descricao;
    private int codLaboratorio;
    
    @Override
    public String toString() {
        return "Equipamentos{" + "codigo=" + this.codEquipamento + "tipo="+this.tipo + ", descricao=" + this.descricao + ", codigoLaboratorio=" + this.codLaboratorio + "}";
    }
    
    /**
     * @return the codEquipamento
     */
    public int getCodEquipamento() {
        return codEquipamento;
    }

    /**
     * @param codEquipamento the codEquipamento to set
     */
    public void setCodEquipamento(int codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    /**
     * @return the tipo
     */
	 public String getTipo(){
		 return this.tipo;
	 }
	 	 
	 /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }	 
	 
	 /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codLaboratorio
     */
    public int getCodLaboratorio() {
        return codLaboratorio;
    }

    /**
     * @param codLaboratorio the codLaboratorio to set
     */
    public void setCodLaboratorio(int codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }
}
