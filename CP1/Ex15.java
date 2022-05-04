package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.printf("Digite o primeiro lado do Triagulo: ");
		lado1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do Triagulo: ");
		lado2 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do Triagulo: ");
		lado3 = ler.nextDouble();
		
		
		if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.printf("Esse é um Triângulo escaleno: ");				
			}else if(lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado3 != lado2 || lado2 == lado3 && lado3 != lado1){
				System.out.printf("Esse é um Triângulo isósceles: ");
			}else {
				System.out.printf("Esse é um Triângulo equilátero: ");
			}
		}else {
			System.out.printf("Ele não é um Triângulo! ");
		}
	}
}
