package Principal;

import Pdv.Comprando;
import TipoDeProdutos.Desinfetante;
import TipoDeProdutos.ExtratoDeTomate;

public class Principal {

	public static void main(String[] args) {
		
		Comprando Comprando = new Comprando();
		
		Desinfetante Desinfetante = new Desinfetante();
		Comprando.Comprando(Desinfetante);
		
		System.out.println("\n");
		
		ExtratoDeTomate ExtratoDeTomate = new ExtratoDeTomate();
		Comprando.Comprando(ExtratoDeTomate);
		
	}
}
