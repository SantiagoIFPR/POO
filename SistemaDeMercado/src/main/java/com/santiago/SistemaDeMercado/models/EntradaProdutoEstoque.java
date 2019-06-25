package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EntradaProdutoEstoque {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String qtdeProdutoEntrada;
	private String qtValidadeProduto;
	private String qtEntrada;
	private String codEntradaProduto;
	private String qtdeDisponivel;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getQtdeProdutoEntrada() {
		return qtdeProdutoEntrada;
	}
	public void setQtdeProdutoEntrada(String qtdeProdutoEntrada) {
		this.qtdeProdutoEntrada = qtdeProdutoEntrada;
	}
	public String getQtValidadeProduto() {
		return qtValidadeProduto;
	}
	public void setQtValidadeProduto(String qtValidadeProduto) {
		this.qtValidadeProduto = qtValidadeProduto;
	}
	public String getQtEntrada() {
		return qtEntrada;
	}
	public void setQtEntrada(String qtEntrada) {
		this.qtEntrada = qtEntrada;
	}
	public String getCodEntradaProduto() {
		return codEntradaProduto;
	}
	public void setCodEntradaProduto(String codEntradaProduto) {
		this.codEntradaProduto = codEntradaProduto;
	}
	public String getQtdeDisponivel() {
		return qtdeDisponivel;
	}
	public void setQtdeDisponivel(String qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}
	
}
