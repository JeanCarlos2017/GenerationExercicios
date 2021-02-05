package semana4.dia4.Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EstoqueCollection {
	private Collection<Estoque> colletionEstoque;
	
	public EstoqueCollection(Collection<Estoque> collection) {
		this.colletionEstoque = collection;
	}
	
	public void addEstoque(Estoque e) {
		this.colletionEstoque.add(e);
	}
	
	public boolean removeEstoque(String nomeResponsavel) {
		Estoque e = buscaEstoque(nomeResponsavel);
		return this.colletionEstoque.remove(e);
	}
	
	public Estoque buscaEstoque(String nomeResponsavel) {
		for (Estoque e: this.colletionEstoque) {
			if (e.getNomeResponsavel().equals(nomeResponsavel)) {
				return e;
			}
		}
		
		return null;
	}
	
	public void atualizaEstoque(Estoque novoEstoque) {
		this.removeEstoque(novoEstoque.getNomeResponsavel());
		this.addEstoque(novoEstoque);
	}
	
	public void imprimeEstoques() {
		System.out.println(this.colletionEstoque);
	}
	
	public void ordenaElementos() {
		//convertendo para o tipo List e fazendo a orndenação
		Collections.sort((List<Estoque>) this.colletionEstoque);
	}
}
