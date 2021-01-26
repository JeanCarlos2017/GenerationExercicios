package semana3;

import java.util.Scanner;

public class ex4 {
	//programa que calcula D, através de R e S 
		public static void main (String[] args) {
			int A, B, C, R, S;
			float D;
			try (Scanner leitura = new Scanner(System.in)) {
				
				//leitura dos dados fornecidos pelo usuário 
				System.out.print("Digite o valor de A: ");
				A = leitura.nextInt();
				System.out.print("Digite o valor de B: ");
				B = leitura.nextInt();
				System.out.print("Digite o valor de C: ");
				C = leitura.nextInt();
				
				//calculando R e S 
				R = (int) Math.pow(A+B, 2);
				S= (int) Math.pow(B+C, 2);
				
				
				//calculando D
				D = (float) ((R+S)/2.0);
				System.out.println("O valor de D: "+D);
				
				
			}catch(Exception e) {
				System.out.println("Erro na leitura de dados. "+e);
			}

		}
}
