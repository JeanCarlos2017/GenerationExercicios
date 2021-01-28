package semana3.dia3;

import java.util.Scanner;

public class ex4Pesquisa {
	/*
	 * 4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
	 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
	 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, 
	 * se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que 
	 * permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		•	o número de pessoas calmas; 
		•	o número de mulheres nervosas; 
		•	o número de homens agressivos; 
		•	o número de outros calmos;
		•	o número de pessoas nervosas com mais de 40 anos; 
		•	o número de pessoas calmas com menos de 18 anos.

	 */
	public static void main (String[] args) {
		int genero, idade, comportamento, contParticipante = 0,
				//contadores 
				contPesCalma= 0, contMulNerv= 0, contHAgressivo=0, contOutCalmo= 0, 
				contMais40Nerv= 0, contMen18= 0;
		
		try (Scanner leitura = new Scanner(System.in)) {
			while(contParticipante < 150) {
				contParticipante++;
				System.out.print("Digite a idade: ");
				idade = leitura.nextInt();
				System.out.print("Digite o sexo (1-feminino / 2-masculino / 3-Outros): ");
				genero = leitura.nextInt();
				System.out.print("Digite (1, se a pessoa era calma; "
						+ "2, se a pessoa era nervosa e "
						+ "3, se a pessoa era agressiva): ");
				comportamento = leitura.nextInt();
				System.out.println("\n");
				
				//o número de pessoas calmas; 
				if (comportamento == 1) contPesCalma++;
				//o número de mulheres nervosas;
				if (genero == 1 && comportamento == 2) contMulNerv++;
				//o número de homens agressivos;
				if(genero == 2 && comportamento == 3) contHAgressivo++;
				//o número de outros calmos;
				if(genero == 3 && comportamento == 1) contOutCalmo++;
				//o número de pessoas nervosas com mais de 40 anos; 
				if(idade > 40 && comportamento == 2) contMais40Nerv++;
				//o número de pessoas calmas com menos de 18 anos.
				if(idade < 18 && comportamento == 1) contMen18++;			
			
			}
			System.out.println("\n\n\n");
	
			System.out.println("o número de pessoas calmas: "+contPesCalma);
			System.out.println("o número de mulheres nervosas: "+contMulNerv);
			System.out.println("o número de homens agressivos: "+contHAgressivo);
			System.out.println("o número de outros calmos: "+contOutCalmo);
			System.out.println("o número de pessoas nervosas com mais de 40 anos: "+contMais40Nerv);
			System.out.println("o número de pessoas calmas com menos de 18 anos: "+contMen18);
		
		}catch(Exception ex) {
			System.out.println("Entrada Inválida. Erro: "+ex);
		}
		
	}
}
