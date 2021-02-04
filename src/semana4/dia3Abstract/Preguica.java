package semana4.dia3Abstract;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String emitirSom() {
		return "som bixo preguiça";
	}
	
	public String subirArvores() {
		return "preguiça subindo em uma árvore";
	}

	@Override
	public String toString() {
		return super.toString() +"[Som= " + emitirSom() + "\nsubir em árvores: =" + subirArvores()+  "]\n";
	}
	
	
}
