   public class Aluno extends Pessoa {

	private long matricula;

	public Aluno (String n, String e,long m){
		super (n,e);
		this.matricula = m;
	}
	 public String getMatricula(){
            matricula = this.matricula;
	}
	public void setmatricula(String Matricula){
            matricula = this.matricula;
	}

        public void setMatricula(int matricula){
            this.matricula = matricula;
        }

        public void mostraDadosAluno(){
		super.mostraDados();
            System.out.println("Matricula: "+ this.matricula);
	}

}
