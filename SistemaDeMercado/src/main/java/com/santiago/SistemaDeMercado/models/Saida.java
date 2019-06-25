package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Saida {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String qtdeSaida;
	private String qtRetiradaProduto;
	private String codSaidaProtudo;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getQtdeSaida() {
		return qtdeSaida;
	}
	public void setQtdeSaida(String qtdeSaida) {
		this.qtdeSaida = qtdeSaida;
	}
	public String getQtRetiradaProduto() {
		return qtRetiradaProduto;
	}
	public void setQtRetiradaProduto(String qtRetiradaProduto) {
		this.qtRetiradaProduto = qtRetiradaProduto;
	}
	public String getCodSaidaProtudo() {
		return codSaidaProtudo;
	}
	public void setCodSaidaProtudo(String codSaidaProtudo) {
		this.codSaidaProtudo = codSaidaProtudo;
	}
	
}
