public class Professor extends Pessoa {
    private String disciplina;
    private int cargaHoraria;

    public Professor(String nome, String email, String disciplina, int cargaHoraria){
        super(nome, email);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }
	  public void setNome(String nome){
            nome = this.nome;
        }
        public void setEmail(String email){
            this.email = email;
        }
        //gets
        public String getNome(){
            return this.nome;
        }
        public String getEmail(){
            return this.email;
        }
    public void mostraDados();{
        super.mostraDados();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Carga Horária: " + this.cargaHoraria); 
	}
} 
