package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String dtpedido;
	private String dtPrivEntrega;
	private String observacaoSituacao;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getDtpedido() {
		return dtpedido;
	}
	public void setDtpedido(String dtpedido) {
		this.dtpedido = dtpedido;
	}
	public String getDtPrivEntrega() {
		return dtPrivEntrega;
	}
	public void setDtPrivEntrega(String dtPrivEntrega) {
		this.dtPrivEntrega = dtPrivEntrega;
	}
	public String getObservacaoSituacao() {
		return observacaoSituacao;
	}
	public void setObservacaoSituacao(String observacaoSituacao) {
		this.observacaoSituacao = observacaoSituacao;
	}
	
	
}
