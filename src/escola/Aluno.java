package escola;

public class Aluno extends Pessoa {

	private long matricula;

	public Aluno() {
		super();
		System.out.println("Informe a matricula:");
		this.matricula = Escola.scan.nextLong();
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
