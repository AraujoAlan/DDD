package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3, valor4, media;
		
		System.out.printf("Digite o primeiro valor: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o primeiro valor: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Digite o primeiro valor: ");
		valor3 = ler.nextDouble();
		
		System.out.printf("Digite o primeiro valor: ");
		valor4 = ler.nextDouble();
		
		media = valor1 + valor2 + valor3 + valor4 / 4;
		
		System.out.printf("A m�dia �: %.2f", media);

	}

}
