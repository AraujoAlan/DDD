package Ex37;
import java.io.IOException;
import java.util.Scanner;


import java.util.ArrayList;


public class Programa {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
		int opcao;
		int id;
		String nome;
		int idade;
		String email;
		char possuiContaBancaria;
		ContaBancaria conta;
		String agencia;
		double saldo;
		String numero;
		int escolha;
		
		do {
			System.out.printf("==> Sistema de Cadastro de Clientes <== \n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Incluir Cliente \n"+
							  "2 - Atualizar Cliente \n"+
					 		  "3 - Excluir Cliente \n"+
							  "4 - Exibir Cliente \n" +
					 		  "5 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				Cliente cliente = new Cliente();
				id = listaClientes.size()+1;
				cliente.setId(id);
				
				System.out.printf("\nDigite o nome do cliente: ");
				nome = ler.next();
				cliente.setNome(nome);
				
				System.out.printf("Digite a idade do cliente: ");
				idade = ler.nextInt();
				cliente.setIdade(idade);
				
				System.out.printf("Digite o email do cliente: ");
				email = ler.next();
				cliente.setEmail(email);
				
				System.out.printf("Possui conta bancaria? (S/N)");
				possuiContaBancaria = ler.next().charAt(0);
				
				if (possuiContaBancaria == 'S') {
					ContaBancaria contaBancaria = new ContaBancaria();
				
					
					System.out.printf("Digite a agência da conta: ");
					agencia = ler.next();
					contaBancaria.setAgencia(agencia);
					
					System.out.printf("Digite o número da conta: ");
					numero = ler.next();
					contaBancaria.setNumero(numero);
					
					System.out.printf("Digite o saldo da conta: ");
					saldo = ler.nextDouble();
					contaBancaria.setSaldo(saldo);
					
					conta = contaBancaria;
					cliente.setConta(conta);
				}
				else {
					conta = null;
					cliente.setConta(conta);
				}
				
				listaClientes.add(cliente);
				
			}
			else if (opcao == 2) {
				for(Cliente cliente: listaClientes) {
					System.out.printf("\nID: %d - Nome: %s - Idade: %d - Email: %s \n", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail());
					
					if (cliente.getConta()!=null) {
						System.out.printf("Agência: %s - Número: %s - Saldo: R$%s \n", cliente.getConta().getAgencia(),cliente.getConta().getNumero(), cliente.getConta().getSaldo());
					}
				}
				
				System.out.printf("Digite o id do cliente que deseja atualizar: ");
				id = ler.nextInt();
				
				System.out.printf("Digite o novo nome do cliente: ");
				nome = ler.next();
				
				System.out.printf("Digite a nova idade do cliente: ");
				idade = ler.nextInt();
				
				System.out.printf("Digite o novo email do cliente: ");
				email = ler.next();
				
				Cliente cliente = listaClientes.get(id-1);
				
				cliente.setNome(nome);
				cliente.setIdade(idade);
				cliente.setEmail(email);
				System.out.printf("Deseja atualizar os dados da conta bancaria do cliente?\n");
				System.out.printf("1 - sim\n"+
								  "2 - não\n");
				escolha = ler.nextInt();
				
					if (escolha == 1) {
						System.out.printf("Digite a nova agência da conta: ");
						agencia = ler.next();
						cliente.getConta().setAgencia(agencia);
						
						System.out.printf("Digite o novo número da conta: ");
						numero = ler.next();
						cliente.getConta().setNumero(numero);
						
						System.out.printf("Digite o novo saldo da conta: ");
						saldo = ler.nextDouble();
						cliente.getConta().setSaldo(saldo);
						
					}
					
				System.out.printf("Cliente atualizado com sucesso!");
				System.in.read();
				
			}
			else if (opcao == 3) {
				for(Cliente cliente: listaClientes) {
					System.out.printf("\nID: %d - Nome: %s - Idade: %d - Email: %s \n", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail());
					if(cliente.getConta() != null) {
						System.out.printf("Agência: %s - Número: %s - Saldo: R$%s \n", cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
					}	
				}
				
				System.out.printf("Digite o id do cliente que deseja excluir: ");
				id = ler.nextInt();
				
				listaClientes.remove(id-1);
				System.out.printf("Cliente excluido com sucesso!");
				
			System.in.read();
			
			}
			else if (opcao == 4) {
				for(Cliente cliente: listaClientes) {
					System.out.printf("\nID: %d - Nome: %s - Idade: %d - Email: %s \n", cliente.getId(), cliente.getNome(), cliente.getIdade(), cliente.getEmail());
					if(cliente.getConta() != null){
						System.out.printf("Agência: %s - Número: %s - Saldo: R$%s \n", cliente.getConta().getAgencia(), cliente.getConta().getNumero(), cliente.getConta().getSaldo());
					}
			}
			System.in.read();
			}
		}
		while (opcao != 5);

		ler.close();
	}

}