package semana4.dia3Abstract;

public class Cavalo extends Quadrupede {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String correr() {
		return ("Cavalo correndo!");		
	}

	@Override
	public String emitirSom() {
		return "hinn in in";		
	}
	
}


