package Ex19;

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
		
		ArrayList<Aluno> alunoList = new ArrayList<>();
		
        AlunoBD db = new AlunoBD();
        
		int option;
		int id;
		int ra;
		String nome;
		String curso;
        int valor = random.nextInt(100)+1;
        
		do {
			
	        System.out.printf("SISTEMA DE CADASTRO DE ALUNOS \n" +
	                "Escolha uma Opcao:\n\n" +
	                "1) Cadastrar Alunos\n" +
	                "2) Listar Alunos\n" +
	                "3) Sair\n\n");
	        System.out.printf("Digite a opção desejada: ");
	        
	        option = ler.nextInt();
	        
	        if (option == 1) {
                try {
	        		
	        	Aluno a = new Aluno();
	        	
            	id = alunoList.size() + valor;
            	a.setId(id);
	        	
	            System.out.printf("Digite o nome do Aluno: ");
                nome = ler.next();
                a.setNome(nome);

                System.out.printf("Digite o RA: ");
                ra = ler.nextInt();
                a.setRa(ra);

                System.out.printf("Digite o Curso: ");
                curso = ler.next();
                a.setCurso(curso);
                
                db.InserirAlunoDB(a);
                
                } catch (Exception e) {
                    System.out.printf("Revise as informacoes digitadas");
                }
                
                System.out.printf("Aluno cadastrado com sucesso");
                System.in.read();

	        	
	        } else if (option == 2) {
	        	
	            db.ListarAlunoDB();	
	        }
		}
		
	while (option != 3);
	
	ler.close();
        
        
    }
}
