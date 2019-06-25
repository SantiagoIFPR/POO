package com.santiago.SistemaDeMercado.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	private String usuario;
	private String dtAdimissao;
	private String setorfuncionario;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDtAdimissao() {
		return dtAdimissao;
	}
	public void setDtAdimissao(String dtAdimissao) {
		this.dtAdimissao = dtAdimissao;
	}
	public String getSetorfuncionario() {
		return setorfuncionario;
	}
	public void setSetorfuncionario(String setorfuncionario) {
		this.setorfuncionario = setorfuncionario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
