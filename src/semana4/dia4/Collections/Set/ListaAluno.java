package semana4.dia4.Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAluno {
	public static void main(String[] args) {
	    Set<Aluno> conjunto = new HashSet<Aluno>();
	    Set<Aluno> conjuntoOrdenando = new TreeSet<Aluno>();

	    Aluno a = new Aluno("João da Silva", "Linux básico", 0);
	    Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
	    Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    Aluno e = new Aluno("Jean Carlos", "FullStack Java jr", 0);
	    Aluno f = new Aluno("AAluno 01", "SpringMVC", 0);
	    Aluno g = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    conjunto.add(a);
	    conjunto.add(b);
	    conjunto.add(c);
	    conjunto.add(d);
	    conjunto.add(e);
	    conjunto.add(f);
	    System.out.println(conjunto);
	    
	    //ordenando 
	    //não tem como ordenar um HashSet
	    System.out.println("Ordenando...");
	    conjuntoOrdenando.addAll(conjunto);
	    System.out.println(conjuntoOrdenando);
	    
	    //verificando que tem o mesmo efeito 
	    System.out.println("Verificando que TreeSet não permite elementos repetidos: ");
	    conjuntoOrdenando.add(a);
	    conjuntoOrdenando.add(b);
	    conjuntoOrdenando.add(c);
	    conjuntoOrdenando.add(d);
	    conjuntoOrdenando.add(e);
	    conjuntoOrdenando.add(f);
	    conjuntoOrdenando.add(g);
	    System.out.println(conjuntoOrdenando);
	    

	  
	  }
}
