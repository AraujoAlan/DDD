package estrutura_repeticao;

import java.util.Scanner;

public class ex22D {

	public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        
        double numA, numB;
       
        System.out.printf("Digite o primeiro número: ");
        numA = ler.nextDouble();
        
        System.out.printf("Digite o segundo número: ");
        numB = ler.nextDouble();
        
        do {
            System.out.printf("Digite novamente o segundo número: ");
            numB = ler.nextDouble();
        }
        while(numB <= numA);
        System.out.printf("Segundo Número maior ! ");

	}

}
