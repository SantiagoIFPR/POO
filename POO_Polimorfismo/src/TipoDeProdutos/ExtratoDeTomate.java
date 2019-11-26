package TipoDeProdutos;

import Interface.Produto;

public class ExtratoDeTomate implements Produto {
	
	@Override
	public void modelo() {
		System.out.println("Sache");
	}

	@Override
	public void marca() {
		System.out.println("Polmarola");
	}

	@Override
	public void peso() {
		System.out.println("340g");
	}
	
	@Override
	public void preco() {
		System.out.println("3.50");
	}

	@Override
	public void fragancia() {
		// TODO Auto-generated method stub
		
	}
}

