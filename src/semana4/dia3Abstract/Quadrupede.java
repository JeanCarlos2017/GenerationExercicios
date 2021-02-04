package semana4.dia3Abstract;

public abstract class Quadrupede extends Animal{

	public Quadrupede(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public abstract String correr();

	@Override
	public String toString() {
		return super.toString() + 
				"[Som: "+this.emitirSom()+"]\n[Corrida: "+this.correr()+"]\n";
	}

}
