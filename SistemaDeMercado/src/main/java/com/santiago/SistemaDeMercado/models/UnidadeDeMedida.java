package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnidadeDeMedida {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String codUnidade;
	private String descricaoUnidade;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getCodUnidade() {
		return codUnidade;
	}
	public void setCodUnidade(String codUnidade) {
		this.codUnidade = codUnidade;
	}
	public String getDescricaoUnidade() {
		return descricaoUnidade;
	}
	public void setDescricaoUnidade(String descricaoUnidade) {
		this.descricaoUnidade = descricaoUnidade;
	}
	
}
