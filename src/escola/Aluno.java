package escola;

import java.util.InputMismatchException;

public class Aluno extends Pessoa {

	private long matricula;

	public Aluno() {
		super();
		try { // comando para invocaçoes/chamados
			System.out.println("Informe a matricula:");
			this.matricula = Escola.scan.nextLong();
		} catch (InputMismatchException e) { // tratamento a condiçao
			
			System.out.println("MATRICULA APENAS NUMEROS");
			Escola.scan.nextLine();//pra nao aparecer o erro
		}
	}

	public Aluno(String n, String e, long m) {
		super(n, e);
		this.matricula = m;
	}

	public long getMatricula() {
		return this.matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public void mostraDados() {
		super.mostraDados();
		System.out.println("Matricula: " + this.matricula);
	}

}
