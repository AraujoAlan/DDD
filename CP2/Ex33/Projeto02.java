package Ex33;

import java.util.Scanner;

public class Projeto02 {
	public static void main (String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			
			Produto [] listaProduto = new Produto[10];
			
			for (int i=0; i<=9; i++) {
			
				Produto p = new Produto();
			
				// Popula o objeto (preenche os atributos do objetos)
				System.out.printf("Digite o id do produto: ");
				p.id = ler.nextInt();
      
				System.out.printf("Digite a descrição do produto: ");
				p.descricao = ler.next();
				
				System.out.printf("Digite o valor do produto: ");
				p.valor = ler.nextDouble();
      
				System.out.printf("Digite a quantidade do produto: ");
				p.quantidade = ler.nextDouble();
			
				// Adiciona os objeto no array "listaPessoas"
				listaProduto[i] = p;            
			}
				for (int i=0; i<=9; i++) {
					if (listaProduto[i].valor < 100) {
						System.out.printf("\nSeu ID de indentificação é: %d. O produto é o %s, tendo em estoque um quantidade de %.0f unidades, sendo que a unidade está saindo pelo valor de R$%.2f.", listaProduto[i].id, listaProduto[i].descricao, listaProduto[i].quantidade, listaProduto[i].valor);
					}
				}
		}
	}
}
