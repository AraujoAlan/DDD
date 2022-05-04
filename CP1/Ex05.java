package entrada_processamento_saida;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double TC, TF;
		
		System.out.printf("Digite a temperatura em Graus Celsius: ");
		TC = ler.nextDouble();
		
		TF = (TC * 9/5) + 32;
		
		System.out.printf("Sua temperatura em fahrenheit é: %.2fº", TF);
	}

}
