
package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Saida {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	@ManyToOne
	private Produtos produtos;
	private String qtdeSaida;
	private String dtRetiradaProduto;
	private String codSaidaProduto;
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
	public String getQtdeSaida() {
		return qtdeSaida;
	}
	public void setQtdeSaida(String qtdeSaida) {
		this.qtdeSaida = qtdeSaida;
	}
	public String getDtRetiradaProduto() {
		return dtRetiradaProduto;
	}
	public void setDtRetiradaProduto(String dtRetiradaProduto) {
		this.dtRetiradaProduto = dtRetiradaProduto;
	}
	public String getCodSaidaProduto() {
		return codSaidaProduto;
	}
	public void setCodSaidaProduto(String codSaidaProduto) {
		this.codSaidaProduto = codSaidaProduto;
	}
	
	
}
