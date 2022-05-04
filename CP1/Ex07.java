package entrada_processamento_saida;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double produto1, produto2, produto3, produto4, produto5, totalProduto, pagamento, troco;
		
		System.out.printf("Digite o valor do Primeiro Produto: ");
		produto1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do Segundo Produto: ");
		produto2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do Terceiro Produto: ");
		produto3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do Quarto Produto: ");
		produto4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do Quinto Produto: ");
		produto5 = ler.nextDouble();
		
		totalProduto = produto1 + produto2 + produto3 + produto4 + produto5;
		
		System.out.printf("o total da compra é: %.2fR$", totalProduto);
		
		System.out.printf("\nDigite o valor do pagamento: ");
		pagamento = ler.nextDouble();
		
		troco = pagamento - totalProduto;
		
		System.out.printf("o troco da compra é: %.2fR$", troco);
		

	}

}
