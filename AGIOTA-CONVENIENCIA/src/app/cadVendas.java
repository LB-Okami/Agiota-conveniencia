package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entities.Bebida;
import entities.Doces;
import entities.Gelo;
import entities.Loja;
import entities.Produto;
import entities.Revista;
import entities.Salgadinho;

public class cadVendas  {
	public static void main(String[] args) throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		double total = 0;
		double totalSalgadinho = 0;
		double totalBebida = 0;
		double totalDoces = 0;
		double totalGelo = 0;
		double totalRevista = 0;
		int vezes = 0;
		
		List<Produto> lista = new ArrayList<>();
		
		Revista marvel = new Revista("revista marvel", "6985", 50, 10, "Panini");
		lista.add(marvel);
		Salgadinho queijo = new Salgadinho("salgadinho-queijo", "5652", 13, 10, "Pringles");
		lista.add(queijo);
		Doces doce = new Doces("chocolate", "1582", 7, 10, "Nestle");
		lista.add(doce);
		Gelo gelo = new Gelo("gelo", "6523", 12, 10, 12);
		lista.add(gelo);
		Bebida coca = new Bebida("coca", "7852", 8, 10, "Coca-cola");
		lista.add(coca);
		
		for(Produto x : lista) {
			System.out.println(x.getDescricao());
		}
	
		
		System.out.println("          ╔                             ╗");
		System.out.print("          ║   Agiota Conveniência G7®️   ║\n");
		System.out.print("	  ╚                             ╝\n");
		System.out.print("──────────────────────────────────────────────────");
		System.out.println("\n         Aqui, você não fica nos devendo...");
		Thread.sleep(100);
		System.out.print("                   ( ಠ ʖ̯ ಠ )\n");
		System.out.println();
		System.out.println();
			
		Thread.sleep(100);
		
		System.out.print("               Carregando sistema");

		String reticencias = "";
		
		for (int x = 0; x < 3; x++) {			
			for (int y = 0; y < 1; y++) {
				reticencias = ".";
				System.out.print(reticencias);
				reticencias += ".";
				Thread.sleep(100);			
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("               [Sistema carregado]");
		Thread.sleep(100);
		
		
		
		limpatela();
		
		int tipoProduto;
		
		do {
			System.out.print("\nDigite uma opção:\n\n1 - Bebidas\n2 - Salgadinhos\n3 - Doces\n4 - Gelo\n5 - Revistas\n6 - Sair\n");
			tipoProduto = leia.nextInt();
			
			if (tipoProduto < 1) {
				System.out.println("\nPor favor, insira uma opção válida");
				
			} else if (tipoProduto == 1) { // Início bebida
				
				while(coca.getQuantEstoque() == 10) {
					System.out.printf("Quantas você deseja comprar? Estoque: %d \n", coca.getQuantEstoque());
					System.out.printf("Preço unitário: R$%.2f \n", coca.getValorUnitario());
					int quantidadeBebida = leia.nextInt();
					
					for(int x = 0; x < lista.size(); x++) {
						if(lista.get(x).getDescricao().contains("coca") == true) {
							if(quantidadeBebida <= lista.get(x).getQuantEstoque())
							{
								lista.get(x).retirarEstoque(quantidadeBebida);
								
								totalBebida = quantidadeBebida;
								totalBebida *= coca.getValorUnitario();
							}
							else 
							{
								System.out.println("Não temos essa quantidade no estoque...");
							}
						}
					}
				
			}
				
			} else if (tipoProduto == 2) { // Início Salgadinho
				
				while(queijo.getQuantEstoque() == 10) {
					System.out.printf("Quantas você deseja comprar? Estoque: %d \n", queijo.getQuantEstoque());
					System.out.printf("Preço unitário: R$%.2f \n", queijo.getValorUnitario());
					int quantidadeSalgadinho = leia.nextInt();
					
					if(quantidadeSalgadinho <= queijo.getQuantEstoque())
					{
						
						queijo.retirarEstoque(quantidadeSalgadinho);
						
						totalSalgadinho = quantidadeSalgadinho;
						totalSalgadinho *= queijo.getValorUnitario();
					}
					else 
					{
						System.out.println("Não temos essa quantidade no estoque...");
					}
				
			}
				
			} else if (tipoProduto == 3) { // Início doces
				
				while(doce.getQuantEstoque() == 10) {
					
					
					System.out.printf("Quantas você deseja comprar? Estoque: %d \n", doce.getQuantEstoque());
					System.out.printf("Preço unitário: R$%.2f \n", doce.getValorUnitario());
					int quantidadeDoces = leia.nextInt();
				
					if(quantidadeDoces <= doce.getQuantEstoque())
					{
						
						doce.retirarEstoque(quantidadeDoces);
						
						totalDoces = quantidadeDoces;
						totalDoces *= doce.getValorUnitario();
					}
					else 
					{
						System.out.println("Não temos essa quantidade no estoque...");
					}
				
			}
				
			} else if (tipoProduto == 4) { // Início gelo
				
				while(gelo.getQuantEstoque() == 10) {
					
					System.out.printf("Quantas você deseja comprar? Estoque: %d \n", gelo.getQuantEstoque());
					System.out.printf("Preço unitário: R$%.2f \n", gelo.getValorUnitario());
					int quantidadeGelo = leia.nextInt();
				
					if(quantidadeGelo <= gelo.getQuantEstoque())
					{	
						gelo.retirarEstoque(quantidadeGelo);
						
						totalGelo = quantidadeGelo;
						totalGelo *= gelo.getValorUnitario();
					}
					else 
					{
						System.out.println("Não temos essa quantidade no estoque...");
					}
				
			}  
				
			} else if (tipoProduto == 5) { // Início revista
				while(marvel.getQuantEstoque() == 10) {
					System.out.printf("Quantas você deseja comprar? Estoque: %d \n", marvel.getQuantEstoque());
					System.out.printf("Preço unitário: R$%.2f \n", marvel.getValorUnitario());
					int quantidadeRevista = leia.nextInt();
				
					if(quantidadeRevista <= marvel.getQuantEstoque())
					{
						
						
						marvel.retirarEstoque(quantidadeRevista);
						
						totalRevista = quantidadeRevista;
						totalRevista *= marvel.getValorUnitario();
					}
					else 
					{
						System.out.println("Não temos essa quantidade no estoque...");
					}
				
			}  
	}

				
			
		} while (tipoProduto != 6);	
		total = totalBebida + totalSalgadinho + totalDoces + totalRevista + totalGelo;
		
		Loja loja = new Loja("515115", "1ksks");
		
		System.out.println("Digite a forma de pagamento 1-Crédito | 2-Débito | 3-Dinheiro");
		int opcaoPagamento = leia.nextInt();
		
		if(opcaoPagamento == 1) {
			System.out.println("Digite o tanto de parcelas (max: 2)");
			vezes = leia.nextInt();
		}
		
		loja.pagamento(opcaoPagamento, vezes, total);
		loja.emissaoNota(total, lista);
		
		System.out.println("\nFim programa.");
		
		
	}

	public static void limpatela() { 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
	}
		
}
	




