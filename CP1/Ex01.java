package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int altura, base, area;
		
		System.out.printf("Digite a base do retangulo: ");
		base = ler.nextInt();
		
		System.out.printf("Digite a altura do retangulo: ");
		altura = ler.nextInt();
		
		area = altura * base;
		
		System.out.printf("O valor da área é: %d", area);
	}

}
