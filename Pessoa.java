  public class Pessoa {

    private String nome = "";
    private String email = "";
    
    public Pessoa(String n){
        this.nome = n;
    }
    public Pessoa(String n,String e){
        this.nome = n;
        this.email = e;
    }

        
        public void setNome(String name){
            name = this.nome;
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

        public void mostraDadosPes(){
            System.out.println("\nDados da Pessoa\nNome: "+ this.nome +"\nEmail: "+this.email);
	}

}
