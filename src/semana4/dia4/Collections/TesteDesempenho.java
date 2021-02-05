package semana4.dia4.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TesteDesempenho {
	/*
	 * fazendo testes de desempenhos em várias collections para as operações de inserção, busca e remoção com 20k elementos  
	 */
	private static final int contElemento = 20000;
	
	public static void insercao(Collection<Integer> collection) {
		//fazendo inserções 
		for (int i = 0; i < TesteDesempenho.contElemento; i++) {
		      collection.add(i);
		}

	}
	public static void busca(Collection<Integer> collection) {
		//fazendo inserções 
		for (int i = 0; i < TesteDesempenho.contElemento; i++) {
			collection.contains(i);
		}
		
	}
	public static void remocao(Collection<Integer> collection) {
		//fazendo inserções 
		for (int i = 0; i < TesteDesempenho.contElemento; i++) {
			collection.remove(i);
		}
		
	}
	
	public static void testaDesempenho(Collection<Integer> collection, int opcao) {
		/*
		 * opção 1: testa inserção
		 * opção 2: testa somente a busca,
		 * opção 3: testa somente a remoção, 
		 * default: testa inserção, busca e remoção
		 * OBS: para testar as opçoes dois e tres é importante enviar a collection preenchida já
		 */
		long tInicio = System.currentTimeMillis();
		switch (opcao) {
			case 1: 
				TesteDesempenho.insercao(collection);
				break;
			case 2:
				TesteDesempenho.busca(collection);
				break;
			case 3: 
				TesteDesempenho.remocao(collection);
				break;
			default:
				TesteDesempenho.insercao(collection);
				TesteDesempenho.busca(collection);
				TesteDesempenho.remocao(collection);
		}
		long tFim = System.currentTimeMillis();
	    System.out.println("Tempo total: " + (tFim - tInicio)+"ms\n");
	}
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList= new LinkedList<>();
		
		System.out.print("ArrayList: ");
		TesteDesempenho.testaDesempenho(arrayList, -1);
		System.out.print("LinkedList: ");
		TesteDesempenho.testaDesempenho(linkedList, -1);
	}
}
