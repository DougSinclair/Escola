   public class Aluno {

    private int matricula = 0;
    private String nome = "";
    private String email = "";

        public void setNome(String nome){
            nome = this.nome;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public void setMatricula(int matricula){
            this.matricula = matricula;
        }

        public void mostraDadosAluno(){
            System.out.println("\nDados do Aluno\nNome: "+ nome +"\nEmail: "+ email +"\nMatricula: "+ matricula);
	}

}

