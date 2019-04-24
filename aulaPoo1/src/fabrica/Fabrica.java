package fabrica;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {
	public static EntityManagerFactory fabrica;
	
	public static EntityManagerFactory get() {
		if(fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("aulaPU");
		}
			return fabrica;
	}
}
