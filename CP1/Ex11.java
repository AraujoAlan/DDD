package estrutura_decisao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double altura, base, area;
		
		System.out.printf("Digite a altura do retangulo: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite a base do retangulo: ");
		base = ler.nextDouble();
		
		area = base * altura;
		
		if(area > 100) System.out.printf("Terreno grande!", area);
		

	}

}
