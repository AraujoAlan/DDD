package estrutura_repeticao;

import java.util.Scanner;

public class EX23W {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int c;
		
			System.out.print("Digite o seu sexo: 1 para femenino e 2 para masculino: ");
			c = ler.nextInt();
    	
			while (c != 1 && c != 2) {
				System.out.printf("Erroou! Tente novamente: ");
				c = ler. nextInt();
			}
	  	System.out.printf("Sexo registrado!");
		}
	}
}	
