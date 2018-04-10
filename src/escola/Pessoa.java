package escola;

  public class Pessoa {

    public String nome = "";
    public String email = "";

    
    public Pessoa(){    	
    	System.out.println("Informe o nome:");
        this.nome = Escola.scan.nextLine();
    	System.out.println("Informe o e-mail:");
        this.email = Escola.scan.nextLine();
        
    }

    public Pessoa(String n,String e){
        this.nome = n;
        this.email = e;
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

        public void mostraDados(){
            System.out.println("\nDados da Pessoa\nNome: "+ this.nome +"\nEmail: "+this.email);
	}

}
