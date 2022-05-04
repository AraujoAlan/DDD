package estrutura_repeticao;

import java.util.Scanner;

public class EX23D {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){	
			int a;

			do {
				System.out.printf("Digite o seu sexo: 1 para feminino e 2 para masculino: ");
				a = ler.nextInt();
			}
			
			while (a != 1 && a != 2);
			
			System.out.printf("Sexo registrado!");	
		}
	}
}