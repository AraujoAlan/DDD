package estrutura_decisao;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.printf("Digite o primeiro numero: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo numero: ");
		num2 = ler.nextDouble();
		
		
        if (num1 > num2) {
            System.out.printf("O maior entre os numeros digitados � o primeiro");
        }else {
            System.out.printf("O maior entre os numeros digitados � o primeiro");
        }

	}

}
