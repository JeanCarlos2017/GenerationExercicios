package semana3.dia2;

import java.util.Scanner;

public class ex2OrdemCrescente {
	public static void main (String[] args) {
		int n1, n2, n3, maior= 0, meio= 0, menor= 0;
		
		try (Scanner leitura = new Scanner(System.in)) {
			System.out.print("Digite o primeiro número: ");
			n1 = leitura.nextInt();
			System.out.print("Digite o segundo número: ");
			n2 = leitura.nextInt();
			System.out.print("Digite o terceiro número: ");
			n3 = leitura.nextInt();
	
			if (n1 >= n2) {
				if (n1 >= n3) {
					//n1 > n2 e n3
					maior = n1;
					if (n2 >= n3) {
						//n1 >= n2 >= n3
						meio= n2;
						menor= n3;
					}else {
						//n1 >= n3 > n2
						meio= n3;
						menor= n2;
					}
				}else {
					//n3 > n1 >= n2
					maior = n3;
					meio = n1;
					menor = n2;
				}
				
			}else {
				//n2 > n1
				if (n2 >= n3) {
					maior = n2;
					if(n3 >= n1) {
						//n2 >= n3 >= n1
						meio= n3;
						menor= n1;
					}else {
						//n2 > n1 > n3
						meio= n1;
						menor= n3;
					}
				}else {
					//n3 > n2 > n1
					maior= n3;
					meio= n2;
					menor= n1;
				}
			}
		System.out.println("Os n�meros em ordem crescente: "+menor+", "+meio+", "+maior);		
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
