package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.printf("Digite sua altura:");
		altura = ler.nextDouble();
		
		System.out.printf("Digite seu peso:");
		peso = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if(imc == 19 || imc > 19 && imc < 25) {
			System.out.printf("Peso Ideal!", imc);
		}else {
			System.out.printf("Não está no peso Ideal", imc);
		}
	}

}
