package semana3.dia4;

import java.util.Scanner;

public class ex1MaiorValor {
	/*
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	   atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */
	
	public static void main(String[] args) {
		float vetor[] = new float[5], 
				maior= Float.MIN_VALUE;//menor número possível para um float
		
		try (Scanner ler= new Scanner(System.in)) {
			
			for(int i=0; i < 5; i++) {
				 System.out.printf("Informe %2do. valor: ", (i+1));
			     vetor[i] = ler.nextFloat();
			     if(vetor[i] > maior) maior= vetor[i];
			}
			
			System.out.println("O maior número digitado foi: "+maior);
		}catch(Exception ex) {
			System.out.println("Entrada Inválida. Erro: "+ex);
		}
		
	}
}
