package semana4.dia4.Collections.Set;

public class Aluno implements Comparable<Aluno>{
	  private String nome;
	  private String curso;
	  double nota;

	  Aluno(String nome, String curso, double nota) {
	    this.nome = nome;
	    this.curso = curso;
	    this.nota = nota;
	  }

	  public String toString() {
	    return this.nome;
	  }

	  public int compareTo(Aluno aluno) {
	    return this.nome.compareTo(aluno.getNome());
	  }

	  public boolean equals(Object o) {
	    Aluno a = (Aluno) o;
	    return this.nome.equals(a.getNome());
	  }

	  public int hashCode() {
	    return this.nome.hashCode();
	  }

	  // Métodos getters e setters
	  public String getNome() {
	    return this.nome;
	  }
	  
	  public String getCurso() {
		  return this.curso;
	  }
	}
