package semana4.dia3Abstract;

import java.util.ArrayList;

public class ClasseTeste {
	public static void main(String[] args) {
		ArrayList<Animal> vet_animal = new ArrayList<>();
		
		vet_animal.add(new Cachorro("rock", 14));
		vet_animal.add(new Cachorro("lala", 6));
		vet_animal.add(new Cachorro("lupi", 7));
		vet_animal.add(new Cachorro("thor", 16));
		vet_animal.add(new Cavalo("Carpeado", 20));
		vet_animal.add(new Cavalo("Carpead2", 22));
		vet_animal.add(new Cavalo("Carpead3", 26));
		vet_animal.add(new Cavalo("Plotka", 15));
		
		//vet_animal.forEach( animal -> System.out.println(animal) );
		System.out.println("Quantidade de animais: "+Animal.getQntAnimal());
		
		//bixo preguiça 
		vet_animal.add(new Preguica("Preguica", 40));
		vet_animal.add(new Preguica("Preguica2", 36));
		vet_animal.add(new Preguica("Preguica3", 2));
		
		vet_animal.forEach( animal -> System.out.println(animal) );
		System.out.println("Quantidade de animais: "+Animal.getQntAnimal());
		
		//para fins explicativos 
//		vet_animal.get(0).setQntAnimal();
//		vet_animal.get(0).setQntAnimal();
//		vet_animal.get(0).setQntAnimal();
//		vet_animal.get(0).setQntAnimal();
//		System.out.println("Quantidade de animais: "+Animal.getQntAnimal());
		
		
		
	}

}
