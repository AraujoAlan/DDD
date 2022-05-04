package estrutura_repeticao;

import java.util.Scanner;

public class EX31W {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner (System.in)) {
					int num;
					int i = 0;
					int a = 1;
					int b = 0;
					int aux;
					
					System.out.printf("Digite até qual casa você gostaria de saber da sequência: ");
					num = ler.nextInt();
					
					while (num <= 0) {
						System.out.printf ("Erro, número negativo! Digite um número positivo: ");
						num = ler.nextInt();
					}

					while (i <= num) {
						System.out.println(a);
						aux = a;
						a = a + b;     
						b = aux;
						i++;
					}
				}
			}
		}
