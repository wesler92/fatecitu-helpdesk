package br.com.fatecitu.helpdesk.model;

public class Laboratorio {
	private int codigoLaboratorio;
	private String nomeLaboratorio;
	
	
	@Override
	public String toString() {
		return "Laboratorio [codigoLaboratorio=" + codigoLaboratorio + ", nomeLaboratorio=" + nomeLaboratorio + "]";
	}


	public int getCodigoLaboratorio() {
		return codigoLaboratorio;
	}


	public void setCodigoLaboratorio(int codigoLaboratorio) {
		this.codigoLaboratorio = codigoLaboratorio;
	}


	public String getNomeLaboratorio() {
		return nomeLaboratorio;
	}


	public void setNomeLaboratorio(String nomeLaboratorio) {
		this.nomeLaboratorio = nomeLaboratorio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoLaboratorio;
		result = prime * result + ((nomeLaboratorio == null) ? 0 : nomeLaboratorio.hashCode());
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
		Laboratorio other = (Laboratorio) obj;
		if (codigoLaboratorio != other.codigoLaboratorio)
			return false;
		if (nomeLaboratorio == null) {
			if (other.nomeLaboratorio != null)
				return false;
		} else if (!nomeLaboratorio.equals(other.nomeLaboratorio))
			return false;
		return true;
	}
	
	
	
	
}
