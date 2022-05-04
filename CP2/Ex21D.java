package estrutura_repeticao;

import java.util.Scanner;

public class Ex21D {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        int num;
       
        System.out.printf("Digite um número positivo: ");
        num = ler.nextInt();
        
        do {
            System.out.printf("Digite um número positivo: ");
            num = ler.nextInt();
        }
        while(num <= 0);
        System.out.printf("Valeu ! ");
	}

}
