package escola;

import java.util.Scanner;

public class Escola {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		int op = mostraMenu();
		
		while ( op != 99  ) {
			switch (op) {
			case 1:
				System.out.println("Aluno");
				break;
			case 2:
				System.out.println("Professor");
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

	private static int mostraMenu() {

		System.out.println("Informe a opção desejada: ");
		System.out.println(" 1 : Aluno ");
		System.out.println(" 2: Professor ");
		System.out.println("99 para sair");

		int opcaoSelecionada = scan.nextInt();

		return opcaoSelecionada;

	}
}
