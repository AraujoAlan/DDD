package Ex20;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Ex08.PessoaFisica;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
        Random random = new Random();
		
		ArrayList<Produto> produtoList = new ArrayList<>();
		
        ProdutoBD db = new ProdutoBD();
        
		int option;
		int id;
		String nome;
		double preco;
		double quantidade;
        int valor = random.nextInt(100)+1;
        
		do {
			
	        System.out.printf("SISTEMA DE CADASTRO DE PRODUTOS \n" +
	                "Escolha uma Opcao:\n\n" +
	                "1) Cadastrar Produtos\n" +
	                "2) Listar Produtos\n" +
	                "3) Sair\n\n");
	        System.out.printf("Digite a opção desejada: ");
	        
	        option = ler.nextInt();
	        
	        if (option == 1) {
	        	
	        		
	        	Produto p = new Produto();
	        	
            	id = produtoList.size() + valor;
            	p.setId(id);
	        	
	            System.out.printf("Digite o nome do Produto: ");
                nome = ler.next();
                p.setNome(nome);

                System.out.printf("Digite o Preço do Produto: ");
                preco = ler.nextInt();
                p.setPreco(preco);

                System.out.printf("Digite a Quantidade: ");
                quantidade = ler.nextInt();
                p.setQuantidade(quantidade);
                
                
                db.InserirProdutoDB(p);
                
                System.out.printf("Produto cadastrado com sucesso");
                System.in.read();


	        	
	        } else if (option == 2) {
	        	
	            db.ListarProdutoDB();
	        }
		}
		
	while (option != 3);
	
	ler.close();
        
        
    }
}
