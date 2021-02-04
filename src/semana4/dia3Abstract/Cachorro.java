package semana4.dia3Abstract;

public class Cachorro extends Quadrupede {
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String emitirSom() {
		return "au au au au";
		
	}
	
	public String correr() {
		return ("Cachorro está correndo");
	}



}
