package entrada_processamento_saida;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double dolar, real;
		
		System.out.printf("Digite a quantidade de dolar para converter em real: ");
		dolar = ler.nextDouble();
		
		real = dolar * 5.04;
		
		System.out.printf("o valor é: %.2fR$", real);

	}

}
