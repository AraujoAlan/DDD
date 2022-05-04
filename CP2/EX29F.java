package estrutura_repeticao;

import java.util.Scanner;

public class EX29F {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner (System.in)) {
					int num, i;
					int a = 1;
					int b = 0;
					int aux;
					
					System.out.printf("Digite até qual casa você gostaria de saber na sequência de Fibonacci: ");
					num = ler.nextInt();
					
					while (num <= 0) {
						System.out.printf("Erro, número negativo! Digite um número positivo: ");
						num = ler.nextInt();
					}
				       
			        for (i=0; i<=num; i++) {
			            System.out.println(a);
			            aux = a;
			            a = a + b;
			            b = aux;
			        } 	
				}
			}
		}
