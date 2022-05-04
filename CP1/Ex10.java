package estrutura_decisao;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.printf("Digite o primeiro numero: ");
		num1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo numero: ");
		num2 = ler.nextDouble();
		
		
        if (num1 > num2) {
            System.out.printf("O maior entre os numeros digitados é o primeiro");
        }else if ( num1 == num2){
            System.out.printf("ATENÇÃO !\nos numeros são identicos!");
        }else {
            System.out.printf("O maior entre os numeros digitados é o segundo");
        }

	}

}
