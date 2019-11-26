package TipoDeProdutos;

import Interface.Produto;

public class Desinfetante  implements Produto {
	
	@Override
	public void modelo() {
		System.out.println("caixa");
	}
	
	@Override
	public void marca() {
		System.out.println("Omo");
	}
	
	@Override
	public void fragancia() {
		System.out.println("Floral");
	}
	
	@Override
	public void peso() {
		System.out.println("1kg");
	}
	
	@Override
	public void preco() {
		System.out.println("6.00");
	}
}


