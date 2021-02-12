package semana4.dia3Abstract;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ClasseTeste {
	
	public static ArrayList<Animal> remove(ArrayList<Animal> vet, String nomeAnimal) {
		//elimina o primeiro animal com o nome passado no parametro
		ArrayList<Animal> temp = (ArrayList<Animal>) vet.stream()
									.filter( animal -> !animal.getNome().equals(nomeAnimal))
									.collect(Collectors.toList());
		
		return temp;
		
	}
	

	public static void main(String[] args) {
		ArrayList<Animal> vet_animal = new ArrayList<>();
		
		vet_animal.add(new Cachorro("rock", 14));
		vet_animal.add(new Cachorro("lala", 6));
		vet_animal.add(new Cachorro("lupi", 7));
		vet_animal.add(new Cachorro("thor", 16));
		vet_animal.add(new Cavalo("Carpeado", 20));
		vet_animal.add(new Cavalo("Carpeado2", 22));
		vet_animal.add(new Cavalo("Carpeado3", 26));
		vet_animal.add(new Cavalo("Plotka", 15));
		
		//vet_animal.forEach( animal -> System.out.println(animal) );
		//System.out.println("Quantidade de animais: "+Animal.getQntAnimal());
		
		//bixo preguiça 
		vet_animal.add(new Preguica("Preguica", 40));
		vet_animal.add(new Preguica("Preguica2", 36));
		vet_animal.add(new Preguica("Preguica3", 2));
		vet_animal.forEach( animal -> System.out.println(animal) );
	
		//removendo elementos 
		System.out.println("\n\nRemovendo elementos \n");
		vet_animal =  ClasseTeste.remove(vet_animal, "thor");
		vet_animal =  ClasseTeste.remove(vet_animal, "Carpeado2");
		vet_animal =  ClasseTeste.remove(vet_animal, "Carpeado3");
		vet_animal =  ClasseTeste.remove(vet_animal, "Preguica2");
		vet_animal =  ClasseTeste.remove(vet_animal, "Preguica3");
		
		//vet_animal.forEach( animal -> System.out.println(animal) );
		System.out.println(vet_animal);
				
		//para fins explicativos 
//		vet_animal.get(0).setQntAnimal();
//		vet_animal.get(0).setQntAnimal();
//		vet_animal.get(0).setQntAnimal();
//		vet_animal.get(0).setQntAnimal();
//		System.out.println("Quantidade de animais: "+Animal.getQntAnimal());
		
		
		
	}

}
