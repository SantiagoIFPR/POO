package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Solicitacao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String dtSolicitacao;
	private String codSolicitacao;
	private String qntSolicitada;
	private String dtAtentimento;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getDtSolicitacao() {
		return dtSolicitacao;
	}
	public void setDtSolicitacao(String dtSolicitacao) {
		this.dtSolicitacao = dtSolicitacao;
	}
	public String getCodSolicitacao() {
		return codSolicitacao;
	}
	public void setCodSolicitacao(String codSolicitacao) {
		this.codSolicitacao = codSolicitacao;
	}
	public String getQntSolicitada() {
		return qntSolicitada;
	}
	public void setQntSolicitada(String qntSolicitada) {
		this.qntSolicitada = qntSolicitada;
	}
	public String getDtAtentimento() {
		return dtAtentimento;
	}
	public void setDtAtentimento(String dtAtentimento) {
		this.dtAtentimento = dtAtentimento;
	}
	
}
