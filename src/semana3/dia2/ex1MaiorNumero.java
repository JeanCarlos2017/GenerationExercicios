package semana3.dia2;

import java.util.Scanner;

public class ex1MaiorNumero {
	
	public static void main (String[] args) {
		int n1, n2, n3;
		
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			n1 = leitura.nextInt();
			System.out.print("Digite o segundo número: ");
			n2 = leitura.nextInt();
			System.out.print("Digite o terceiro número: ");
			n3 = leitura.nextInt();
			
			if (n1 >= n2 && n1 >= n3) {
				System.out.println("O maior número é: "+n1);
			}else if (n2 > n1 && n2 >= n3) {
					System.out.println("O maior número é: "+n2);
				  }else {
					  System.out.println("O maior número é: "+n3);
				  }
			
			
		}catch (Exception ex) {
			System.out.println("Erro na leitura de dados. "+ex);
		}
	}
}
