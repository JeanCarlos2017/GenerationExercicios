package semana4.dia4.Collections;

import java.util.ArrayList;

public class MainEstoque {
	public static void main(String[] args) {
		EstoqueCollection estoqueCollection = new EstoqueCollection(new ArrayList<>());
		//adicionanando elementos, com atributos aleatórios :D
		estoqueCollection.addEstoque(new Estoque(1000, 1, "inflamável", "Jean", "Pronto para queimar e pegar o seguro"));
		estoqueCollection.addEstoque(new Estoque(1, 2, "liquido", "Desconhecido", "Pronto para falir"));
		estoqueCollection.addEstoque(new Estoque(100, 3, "comestível", "Paula", "LellaDoces"));
		estoqueCollection.addEstoque(new Estoque(1000, 4, "descartável", "Corinthians", "não fará falta!"));
		estoqueCollection.addEstoque(new Estoque(2897000, 5, "valor inestimável", "Palmeiras", "Rei da américa"));
		System.out.println("\nAdicionando elementos... ");
		estoqueCollection.imprimeEstoques();
		
		//busca estoque 
		System.out.print("\nBuscando elementos... ");
		System.out.print(estoqueCollection.buscaEstoque("Jean"));
		System.out.print(estoqueCollection.buscaEstoque("Palmeiras"));
		
		//removendo elementos 
		System.out.println("\n\nRemovendo Elementos...");
		estoqueCollection.removeEstoque("Corinthians");
		estoqueCollection.removeEstoque("Desconhecido");
		estoqueCollection.imprimeEstoques();
		
		//atualizando elementos 
		System.out.println("Atualizando o estoque Jean");
		estoqueCollection.atualizaEstoque(new Estoque(50, 1, "inflamável", "Jean", "Preferiu vender os produtos, dá mais dinheiro :D"));
		estoqueCollection.imprimeEstoques();
		
		//ordenando elementos
		estoqueCollection.ordenaElementos();
		System.out.println("\n\nOrdenando Elementos...");
		estoqueCollection.imprimeEstoques();
		
		
		
	}
}
