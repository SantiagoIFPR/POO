package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entidade.Estado;

public class Principal {
	public static void main(String args[]) {
		//respons�vel pelo mapeamento OR
		//pesado, reconmendado criar somente um
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("aulapU");
		//gerenciador...criar um para doa
		//representa a conex�o e tem m�todos CRUD
		EntityManager gerenciador = fabrica.createEntityManager();
		EntityTransaction transacao = gerenciador.getTransaction();
		
		Estado estado = new Estado();
		estado.setNome("PARAN�");
		estado.setSigla("PR");
		
		transacao.begin();
		gerenciador.persist(estado);
		transacao.commit();
		
	}

}
