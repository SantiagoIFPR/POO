package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import entidade.Estado;
import fabrica.Fabrica;

public class DAOEstado {
	
	private EntityManager gerenciador;
	private EntityTransaction transacao;
	
	public Estado inserir(Estado estado) {
		try {
			EntityManagerFactory fabrica = Fabrica.get();
			gerenciador = fabrica.createEntityManager();
			transacao = gerenciador.getTransaction();
			
			transacao.begin();
			gerenciador.persist(estado);
			transacao.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			transacao.rollback();
		}
		return estado;
	}
	
	public List<Estado> buscar(){
		EntityManagerFactory fabrica = Fabrica.get();
		gerenciador = fabrica.createEntityManager();
		
		gerenciador.createQuery("from Estado").getResultList();
		
	}
	
		
	public Estado alterar(Estado estado) { 
		try {
			
		}
		
	}
	public Estado excluir(Estado estado) {
		
	}