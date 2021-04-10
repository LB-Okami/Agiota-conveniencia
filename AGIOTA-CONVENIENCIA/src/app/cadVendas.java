package app;

import entities.Gelo;
import entities.Produto;

public class cadVendas {
	public static void main(String[] args) {
		Gelo gelo = new Gelo("gelo", "649", 15, 10);
		
		gelo.retirarEstoque(4);
		System.out.println(gelo.getQuantEstoque());
		
	}
	

}


