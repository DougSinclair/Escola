package escola;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;

public class Escola {

	public static Scanner scan = new Scanner(System.in);
	
	public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
	
	public static void main(String args[]) {
		
		int op = 0;
		int opAluno = 0;
		int opProfessor = 0;
		
		op = mostraMenu();
		
		while ( op != 99  ) {
			switch (op) {
				case 1: 
					opAluno = mostraMenuAluno();
					while (opAluno != 99) {
						switch (opAluno) {
						case 1:
							cadAluno(); // metodo
							break;
						case 2:
							System.out.println("Busca");
							break;
						case 99:
							System.out.println("Sair");
							break;
						default:
							break;
						}
						opAluno = mostraMenuAluno();
					}
					break;
				case 2: 
					System.out.println("Menu professor");
					opProfessor = mostraMenuProfessor();
					while (opProfessor != 99) {
							switch (opProfessor) {
							case 1:
								cadProf();
		
								break;
							case 2:
								System.out.println("Busca");
								break;
							case 99:
								System.out.println("sair");
								break;
								
							default:
								break;
							
							}
							opProfessor = mostraMenuProfessor();
					}
					break;
				case 99:
					System.exit(0);
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}
			op = mostraMenu();
		}
		
	}
	




	private static void cadAluno() { // chama metodo
		
		System.out.println("Informar os dados do novo aluno:");
		System.out.println(""); // SOP para imprimir algo
		
		Aluno al = new Aluno(); // criar novo objeto
		if (al != null && al.getMatricula() != 0) { // null = sem validade
			System.out.println("Aluno cadastrado com sucesso!");
			listaAlunos.add(al);
		
		}	
		else {
			System.out.println(" Aluno não cadastrado");
			
		}
	}
	
	public static void cadProf() { // chama metodo
		
		System.out.println(" Informar os dados do novo professor:");
	
		Professor prof = new Professor(); // criar novo objeto
		if (prof != null) { // null = sem validade
			System.out.println(" Professor cadastrado com sucesso!"); // SOP para imprimir algo
			listaProfessores.add(prof); // for = para (para algo..)
			for (Professor profe: listaProfessores) {
				profe.mostraDados();
		
			}
		}
				
		
	}

	private static int mostraMenu() {

		System.out.println("Informe a opção desejada: ");
		System.out.println("1 => Aluno ");
		System.out.println("2 => Professor ");
		System.out.println("99 => sair");

		int opcaoSelecionada = scan.nextInt();
		scan.nextLine();

		return opcaoSelecionada;

	}

	private static int mostraMenuAluno() {
		
		System.out.println("Cadastro do Aluno");
		System.out.println("1 => Cadastro Novo");
		System.out.println("2 => Busca");
		System.out.println("99 => Sair");
		
		int opcaoSelecionada = scan.nextInt();
		scan.nextLine();
		return opcaoSelecionada;
		
	}
	
	private static int mostraMenuProfessor() {
		
		System.out.println("Cadastro de Professores");
		System.out.println("1 => Cadastro novo");
		System.out.println("2 => Busca");
		System.out.println("99 => Sair");
		
		int opcaoSelecionada = scan.nextInt();
		scan.nextLine();
		return opcaoSelecionada;
		
		
	}
	
	
		
		
}