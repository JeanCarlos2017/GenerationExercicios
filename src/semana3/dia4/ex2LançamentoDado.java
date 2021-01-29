package semana3.dia4;

import java.util.Scanner;

public class ex2LançamentoDado {
	/*
	 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.
	 */
	public static void main(String[] args) {
		int vetor[] = new int[10], contMaior= 0, maior = Integer.MIN_VALUE;
		int tam_vetor = 10, soma= 0;
		
		try (Scanner ler= new Scanner(System.in)) {
			
			for(int i=0; i < tam_vetor; i++) {
				//entrada do usuário
				 System.out.printf("Informe %2d°. lançamento do dado: ", (i+1));
			     vetor[i] = ler.nextInt();
				
				//gerando os números aleatórios
				//vetor[i] = (int)Math.round(Math.random() * 5)+ 1;
			     
				soma+= vetor[i];
			     //encontrei o maior lançamento de dado
			     if(vetor[i] > maior) {
			    	 maior = vetor[i];
			    	 contMaior = 0; //primeira vez que encontrei o valor, por isso reinicio o contador 
			     }
			     if(vetor[i] == maior) contMaior++; //incremento o valor de maior
			}
			
			//imprimindo o vetor 
			for(int i=0; i < tam_vetor; i++) System.out.print(vetor[i]+" ");
			System.out.println();
			
			System.out.printf("\nA média aritiméticas dos números é: %.2f", (float) soma/tam_vetor);
			System.out.println("\nO maior número digitado foi o "+maior+" "
					+ "e ele foi lançado "+contMaior+" vezes");
			
		}catch(Exception ex) {
			System.out.println("Erro: "+ex);
		}
		
		
	}
}
