package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class EntradaProdutoEstoque {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	@ManyToOne
	private Produtos produtos;
	private String qtdeProdutoEntrada;
	private String dtValidadeProduto;
	private String dtEntrada;
	private String codEntradaProduto;
	private String qtdeDisponivel;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	public String getQtdeProdutoEntrada() {
		return qtdeProdutoEntrada;
	}
	public void setQtdeProdutoEntrada(String qtdeProdutoEntrada) {
		this.qtdeProdutoEntrada = qtdeProdutoEntrada;
	}
	public String getDtValidadeProduto() {
		return dtValidadeProduto;
	}
	public void setDtValidadeProduto(String dtValidadeProduto) {
		this.dtValidadeProduto = dtValidadeProduto;
	}
	public String getDtEntrada() {
		return dtEntrada;
	}
	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
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
