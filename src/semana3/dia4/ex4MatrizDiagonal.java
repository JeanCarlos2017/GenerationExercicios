package semana3.dia4;

import java.util.Scanner;

public class ex4MatrizDiagonal {
	/*
	 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
	 */
	
	public static void main(String[] args) {
		int tamMatriz= 3;
		int n1[][] = new int[tamMatriz][tamMatriz], somaMatriz= 0, somaDiag= 0;
		
		try (Scanner ler= new Scanner(System.in)) {
			for(int linha= 0; linha< tamMatriz; linha++) {
				for(int coluna=0; coluna< tamMatriz; coluna++) {
					//System.out.printf("N1[%d][%d]: ", linha, coluna);
					//n1[linha][coluna] = ler.nextInt();
					
					//modo aleatório
					n1[linha][coluna] = (int)Math.round(Math.random() * 9)+ 1;
					
					//somando os valores da matriz 
					somaMatriz+= n1[linha][coluna];
					//diagonais são as posições n1[0,0], n1[1,1], n1[2,2]...ou seja na posição linha = coluna
					if(linha == coluna) somaDiag+= n1[linha][coluna];
				}
			
			}
			
			System.out.println("Imprindo a  matriz:");
			for(int linha= 0; linha< tamMatriz; linha++) {
				for(int coluna=0; coluna< tamMatriz; coluna++) {
					System.out.printf("%2d |", n1[linha][coluna]);
				}
				System.out.println();
			}
			
			System.out.println("Soma dos valores da matriz: "+somaMatriz);
			System.out.println("Soma dos valores diagonais da matriz: "+somaDiag);
			
		}catch(Exception ex) {
			System.out.println("Erro: "+ex);
		}
	}
}
