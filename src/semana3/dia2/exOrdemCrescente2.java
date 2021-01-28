package semana3.dia2;

import java.util.Scanner;

public class exOrdemCrescente2 {
	//ordenando tres n�meros com o auxilio da biblioteca Math
	public static void main (String[] args) {
		int n1, n2, n3;
		
		
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			n1 = leitura.nextInt();
			System.out.print("Digite o segundo número: ");
			n2 = leitura.nextInt();
			System.out.print("Digite o terceiro número: ");
			n3 = leitura.nextInt();
			
			System.out.println("Os números em ordem crescente: "+ Math.min(n1, Math.min(n2, n3))+
					", "+Math.max(Math.min(n1, n2), Math.max(Math.min(n1, n3), Math.min(n2, n3)))+", "+
					Math.max(n1, Math.max(n2, n3)));		
		}catch (Exception ex) {
				System.out.println("Erro na leitura de dados. "+ex);
		}
	}
}

//testes executados 
//ordem crescente: 1,2,3
//ordem descrescente: 3,2,1
//maior no meio: 1,3,2
//maior no meio: 2,3,1
//tudo repetido: 1,1,1
//n1=n2: 2,2,3
//n1=n2: 3,3,2
//n1=n3: 1,2,1
//n1=n3: 3,2,3
//n2=n3: 1,2,2
//n2=n3: 2,3,3