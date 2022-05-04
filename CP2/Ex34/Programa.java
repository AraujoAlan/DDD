package Ex34;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char possuiContaBancaria;
		int id;
		String nome;
		int idade;
		String email;
		ContaBancaria conta;
		char atualizaEmail;
		
		Cliente[] listaClientes = new Cliente[5];
		for(int i=0; i<=4; i++) {
			
			System.out.printf("Digite o id do Cliente: ");
			id = ler.nextInt();
			
			System.out.printf("Digite o nome do Cliente: ");
			nome = ler.next();
			
			System.out.printf("Digite a idade do Cliente: ");
			idade = ler.nextInt();
			
			System.out.printf("Digite o email do Cliente: ");
			email = ler.next();
			 
			System.out.printf("Possui Conta Bancaria? (S/N)");
			possuiContaBancaria = ler.next().charAt(0);
			
			if (possuiContaBancaria == 'S') {
				ContaBancaria contaBancaria = new ContaBancaria();
			
				
				System.out.printf("Digite a agência da conta: ");
				contaBancaria.agencia = ler.next();
				
				System.out.printf("Digite o número da conta: ");
				contaBancaria.numero = ler.next();
				
				System.out.printf("Digite o saldo da conta: ");
				contaBancaria.saldo = ler.nextDouble();
				
				conta = contaBancaria;
			}
			else {
				conta=null;
			}
			
			Cliente cliente = new Cliente(id, nome, idade, email, conta);
			listaClientes[i] = cliente;
		}
		for(int i=0; i<=4; i++) {
			System.out.printf("\n%S", listaClientes[i].exibirNomeIdade());
			System.out.printf("\n%S", listaClientes[i].exibirDadosConta());
			
			System.out.printf("Gostaria de atualizar o email? (S/N)");
			atualizaEmail = ler.next().charAt(0);
			
			if (atualizaEmail == 'S') {
				System.out.printf("Digite o email: ");
				email=ler.next();
				listaClientes[i].atualizarEmail(email);
				
				System.out.printf("Email atualizado com sucesso! Novo email: %s",listaClientes[i].email);
			}
		}
		ler.close();
	}
}
