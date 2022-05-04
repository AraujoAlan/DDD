package estrutura_decisao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double aceleracao, tempo, velocidadeInicial, velocidade, velocidadeFinal;

		System.out.printf("Digite a Velocidade Inicial do automóvel(Caso o automóvel esteja de respouso, sua velocidade inicial será zero: ");
		velocidadeInicial = ler.nextDouble();
		
		System.out.printf("Digite a aceleração do automóvel: ");
		aceleracao = ler.nextDouble();
		
		System.out.printf("Insira o tempo (em segundos) gasto pelo automóvel para completar o percurso: ");
		tempo = ler.nextDouble();
		
		velocidade = velocidadeInicial + (aceleracao * tempo);
		
		velocidadeFinal = velocidade * 3.6;
		
		if(velocidadeFinal < 40) {
			System.out.printf("Veículo muito lento");
		}
		else if(velocidadeFinal <= 60) {
			System.out.printf("Velocidade Permitida");
		}
		else if(velocidadeFinal <= 80) {
			System.out.printf("Velocidade de Cruzeiro");
		}
		else if(velocidadeFinal <= 120) {
			System.out.printf("Veículo rápido");
		}
		else if(velocidadeFinal > 120) {
			System.out.printf("Veículo muito rápido");
		}
		else {
		}

	}

}
