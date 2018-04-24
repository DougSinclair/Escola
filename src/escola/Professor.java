package escola;

import java.util.InputMismatchException;

public class Professor extends Pessoa {
	private String disciplina;
	private int cargaHoraria;

	public Professor(String nome, String email, String disciplina, int CargaHoraria) {
		super(nome, email);
		this.disciplina = disciplina;
		this.cargaHoraria = CargaHoraria;
	}
	
	public Professor() {
		super();
		try {
		System.out.println("Informe sua disciplina");
		this.disciplina = Escola.scan.nextLine();
		System.out.println("Informe sua carga horária");
		this.cargaHoraria = Escola.scan.nextInt();
		} catch (InputMismatchException e) {
			
			System.out.println("CARGA HORÁRIA APENAS NUMEROS");
			Escola.scan.nextLine();//pra nao aparecer o erro
		}
		}
	
	public void setNome(String nome) {
		nome = this.nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// gets
	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void mostraDados() {
		super.mostraDados();
		System.out.println("Disciplina: " + this.disciplina);
		System.out.println("Carga Horária: " + this.cargaHoraria);
	}
}
