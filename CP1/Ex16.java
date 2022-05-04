package estrutura_decisao;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double hipotenusa,cateto1, cateto2;
		
		System.out.printf("Digite o primeiro lado do Triagulo: ");
		hipotenusa = ler.nextDouble();
		
		System.out.printf("Digite o segundo lado do Triagulo: ");
		cateto1 = ler.nextDouble();
		
		System.out.printf("Digite o terceiro lado do Triagulo: ");
		cateto2 = ler.nextDouble();

		if(hipotenusa == ((cateto1*cateto1) + (cateto2+cateto2))) {
			System.out.printf("Formam um Triangulo! ");		
		}
		else {
			System.out.printf("Não formam um Triangulo! ");
		}
		
	}

}
