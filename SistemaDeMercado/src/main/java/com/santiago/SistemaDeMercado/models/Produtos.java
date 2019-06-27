package com.santiago.SistemaDeMercado.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produtos implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private Double precocusto;
	private Double precodevenda;
	private String marca;
	private String categoria;
	private Double codigodebarras;
	@ManyToOne
	private Fornecedor fornecedor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecocusto() {
		return precocusto;
	}
	public void setPrecocusto(Double precocusto) {
		this.precocusto = precocusto;
	}
	public Double getPrecodevenda() {
		return precodevenda;
	}
	public void setPrecodevenda(Double precodevenda) {
		this.precodevenda = precodevenda;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getCodigodebarras() {
		return codigodebarras;
	}
	public void setCodigodebarras(Double codigodebarras) {
		this.codigodebarras = codigodebarras;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
}
