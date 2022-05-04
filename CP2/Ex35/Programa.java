package Ex35;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cliente[] arrayClientes = new Cliente[5];

        int i = 0;
        int id;
        String nome;
        int idade;
        String email;
        char resposta;
        String agencia;
        String numero;
        double saldo;

        while (i <= 4) {
            Cliente cliente;

            System.out.printf("Coloque o id: ");
            id = ler.nextInt();
            System.out.printf("Coloque o nome: ");
            nome = ler.next();
            System.out.printf("Coloque a idade: ");
            idade = ler.nextInt();
            System.out.printf("Coloque o email: ");
            email = ler.next();
            System.out.printf("Possui conta (S ou N)?");
            resposta = ler.next().charAt(0);

            if (resposta == 'S') {

                Conta conta;

                System.out.printf("Digite a agencia:  ");
                agencia = ler.next();

                System.out.printf("Digite o numero da conta: ");
                numero = ler.next();

                System.out.printf("Digite o saldo da conta: ");
                saldo = ler.nextDouble();

                conta = new Conta(agencia, numero, saldo);
                cliente = new Cliente(id, nome, idade, email, conta);
            }
            else 

                cliente = new Cliente(id, nome, idade, email, null);

            arrayClientes[i] = cliente; 
            i++;
        }

        while (i <= 4) {
            System.out.printf("\nCliente %d criado com sucesso (%s)", arrayClientes[i].id, arrayClientes[i].nome);
            if (arrayClientes[i].conta != null) 
                System.out.printf("\n Conta: %s", arrayClientes[i].conta);
                i++;
            i++;
        }
    }
}
