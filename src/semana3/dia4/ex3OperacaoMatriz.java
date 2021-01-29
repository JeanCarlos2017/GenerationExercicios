package semana3.dia4;

import java.util.Scanner;

public class ex3OperacaoMatriz {
	/*
	 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.
	 */
	public static void main(String[] args) {
		int n1[][] = new int[4][6], n2[][] = new int[4][6];
		int m1[][] = new int[4][6], m2[][] = new int[4][6];
		int qntLinha = 4, qntColuna= 6;
		
		try (Scanner ler= new Scanner(System.in)) {
			//lendo a primeira matriz 
			for(int linha= 0; linha< qntLinha; linha++) {
				for(int coluna=0; coluna< qntColuna; coluna++) {
					//System.out.printf("N1[%d][%d]: ", linha, coluna);
					//n1[linha][coluna] = ler.nextInt();
					
					//modo aleatório
					n1[linha][coluna] = (int)Math.round(Math.random() * 9)+ 1;
				}
			
			}
			//lendo a segunda matriz 
			for(int linha= 0; linha< qntLinha; linha++) {
				for(int coluna=0; coluna< qntColuna; coluna++) {
					//System.out.printf("N2[%d][%d]: ", linha, coluna);
					//n2[linha][coluna] = ler.nextInt();
					
					//modo aleatório
					n2[linha][coluna] = (int)Math.round(Math.random() * 9)+ 1;
				}
			
			}
			//imprimindo as matrizes 
			System.out.println("Imprindo a primeira matriz:");
			for(int linha= 0; linha< qntLinha; linha++) {
				for(int coluna=0; coluna< qntColuna; coluna++) {
					System.out.printf("%2d |", n1[linha][coluna]);
				}
				System.out.println();
			}
			System.out.println("\nImprindo a segunda matriz:");
			for(int linha= 0; linha< qntLinha; linha++) {
				for(int coluna=0; coluna< qntColuna; coluna++) {
					System.out.printf("%2d |", n2[linha][coluna]);
				} 
				System.out.println();
			}
			
			System.out.println("\nSoma das matrizes: ");
			for(int linha= 0; linha< qntLinha; linha++) {
				for(int coluna=0; coluna< qntColuna; coluna++) {
					m1[linha][coluna]= n1[linha][coluna] + n2[linha][coluna];
					System.out.printf("%2d |", m1[linha][coluna]);
				}
				System.out.println();
			}
			
			System.out.println("\nSubtração das matrizes: ");
			for(int linha= 0; linha< qntLinha; linha++) {
				for(int coluna=0; coluna< qntColuna; coluna++) {
					m2[linha][coluna]= n1[linha][coluna] - n2[linha][coluna];
					System.out.printf("%2d |", m2[linha][coluna]);
				}
				System.out.println();
			}
			
			
		}catch(Exception ex) {
			System.out.println("Erro: "+ex);
		}
		
	}
}
