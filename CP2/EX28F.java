package estrutura_repeticao;

import java.util.Scanner;

public class EX28F {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner (System.in)) {
					int num, i, t;
					
					System.out.printf("Digite um número positivo para ser o máximo: ");
					num = ler.nextInt();
					
					while (num <= 0) {
						System.out.printf("Erro, número negativo! Digite um número positivo: ");
						num = ler.nextInt();
					}
				       
			        for (i=1; i<=100; i++) {
			        	t = num * (num + 1);
						i = t / 2;
			            System.out.printf("A soma dos números inteiros positivos do intervalo de um a %d é igual a %d", num, i);
			        } 	
				}
			}
		}

