package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entidade.Estado;

public class Principal {
	public static void main(String args[]) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulaPU");
		
		EntityManager gerenciador = fabrica.createEntityManager();
		
		Estado estado = new Estado();
		estado.setNome("PARANÁ");
		estado.setSigla("PR");
		EntityTransaction transacao = gerenciador.getTransaction();
		
		transacao.begin();
		gerenciador.persist(estado);
		transacao.commit();
	}

}
