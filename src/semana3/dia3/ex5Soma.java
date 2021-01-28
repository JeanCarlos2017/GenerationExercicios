package semana3.dia3;

import java.util.Scanner;

public class ex5Soma {
	/*
	 * 	5- Crie um programa que leia um número do teclado até que encontre um
		número igual a zero. No final, mostre a soma dos números
		digitados.(DO...WHILE)
	 */
	public static void main (String[] args) {
		int entrada_usuario=0, soma= 0;
		
		try (Scanner leitura = new Scanner(System.in)) {
			do {
				System.out.print("Digite um número: ");
				entrada_usuario = leitura.nextInt();
				soma+= entrada_usuario;
				
			}while(entrada_usuario != 0);
			
			System.out.println("Soma dos números digitados: "+soma);
		}catch(Exception ex) {
			System.out.println("Entrada Inválida. Erro: "+ex);
		}
		
	}
}
