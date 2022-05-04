package estrutura_decisao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String sexo;

		System.out.printf("Digite seu Sexo: M para Masculino e F para Feminino: ");
		sexo = ler.next();
		sexo = sexo.toUpperCase();
		
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso / (altura * altura);

		if(sexo.equals("F")) {
			if(imc < 19) {
				System.out.printf("Abaixo do Peso");
			}
			else if(19 <= imc && imc < 24) {
				System.out.printf("Peso ideal");
			}
			else if(imc >= 24) {
				System.out.printf("Abaixo do Peso");
			}
		}
		else if(sexo.equals("M")) {
			if(imc < 20) {
				System.out.printf("Abaixo do Peso");
			}
			else if(20 <= imc && imc < 25) {
				System.out.printf("Peso ideal");
			}
			else if(imc >= 25) {
				System.out.printf("Abaixo do Peso");
			}
		}
		else {
		}
	}

}
