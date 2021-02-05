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
	
	public static void testaDesempenho(Collection<Integer> collection) {
		long tInicio = System.currentTimeMillis();
		
		//fazendo inserções 
		for (int i = 0; i < TesteDesempenho.contElemento; i++) {
		      collection.add(i);
		}
		//realizando busca
		for (int i = 0; i < TesteDesempenho.contElemento; i++) {
		      collection.contains(i);
		}
		//realizando a remoção 
		for (int i = TesteDesempenho.contElemento; i > -1; i--) {
		      collection.remove(i);
		}
		long tFim = System.currentTimeMillis();
	    System.out.println("Tempo total: " + (tFim - tInicio)+"ms\n");

	}
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList= new LinkedList<>();
		
		System.out.print("ArrayList: ");
		TesteDesempenho.testaDesempenho(arrayList);
		System.out.print("LinkedList: ");
		TesteDesempenho.testaDesempenho(linkedList);
	}
}
