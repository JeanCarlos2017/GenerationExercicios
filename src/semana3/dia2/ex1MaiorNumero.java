package semana3.dia2;

import java.util.Scanner;

public class ex1MaiorNumero {
	
	public static void main (String[] args) {
		int n1, n2, n3;
		
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.print("Digite o primeiro n�mero: ");
			n1 = leitura.nextInt();
			System.out.print("Digite o segundo n�mero: ");
			n2 = leitura.nextInt();
			System.out.print("Digite o terceiro n�mero: ");
			n3 = leitura.nextInt();
			
			if (n1 >= n2 && n1 >= n3) {
				System.out.println("O maior n�mero �: "+n1);
			}else if (n2 > n1 && n2 >= n3) {
					System.out.println("O maior n�mero �: "+n2);
				  }else {
					  System.out.println("O maior n�mero �: "+n3);
				  }
			
			
		}catch (Exception ex) {
			System.out.println("Erro na leitura de dados. "+ex);
		}
	}
}
