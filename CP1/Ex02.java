package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int lado, area;
		
		System.out.printf("Digite o lado do quadrado: ");
		lado = ler.nextInt();
		
		area = lado * lado;
		
		System.out.printf("A área é: %d", area);
	}

}
