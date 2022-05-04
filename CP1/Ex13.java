package estrutura_decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double valor1, valor2, valor3;
		
		System.out.printf("Digite o primeiro numero: ");
		valor1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo numero: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro numero: ");
		valor3 = ler.nextDouble();
		
		if(valor1 > valor2 && valor1 > valor3){
			System.out.printf("O maior valor entre eles é o Primeiro!", valor1);
		}else if(valor2 > valor1 && valor2 > valor3){
			System.out.printf("O maior valor entre eles é o Segundo!", valor2);	
		}else {
			System.out.printf("O maior valor entre eles é o Terceiro!", valor3);
			
		}

	}

}
