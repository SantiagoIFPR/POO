package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItensPedido {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String qtdeIntensPedido;
	private String precoIntensPedido;
	private String validade;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getQtdeIntensPedido() {
		return qtdeIntensPedido;
	}
	public void setQtdeIntensPedido(String qtdeIntensPedido) {
		this.qtdeIntensPedido = qtdeIntensPedido;
	}
	public String getPrecoIntensPedido() {
		return precoIntensPedido;
	}
	public void setPrecoIntensPedido(String precoIntensPedido) {
		this.precoIntensPedido = precoIntensPedido;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
}
