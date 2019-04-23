package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entidade.Estado;

public class Principal {
	public static void main(String args[]) {
		//responsável pelo mapeamento OR
		//pesado, reconmendado criar somente um
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulapU");
		//gerenciador...criar um para doa
		//representa a conexão e tem métodos CRUD
		EntityManager gerenciador = fabrica.createEntityManager();
		EntityTransaction transacao = gerenciador.getTransaction();
		
		Estado estado = new Estado();
		estado.setNome("PARANÁ");
		estado.setSigla("PR");
		
		transacao.begin();
		gerenciador.persist(estado);
		transacao.commit();
		
	}

}
