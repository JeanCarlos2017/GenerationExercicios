package semana3;

import java.util.Scanner;

public class ex8 {
		//calcula o valor do carro
		public static void main (String[] args) {
			float valor_carro;
			final float imposto= (float) 0.45;
			final float perc_distribuidor= (float) 0.28;
				
			try (Scanner leitura = new Scanner(System.in)) {
				System.out.print("Digite o valor do carro:");
				valor_carro = leitura.nextFloat();
				
				valor_carro*= 1 + imposto + perc_distribuidor;
				System.out.println("\nValor final do carro é: "+valor_carro);
			}catch (Exception ex) {
				System.out.println("Erro na leitura de dados. "+ex);
			}
		}

}
