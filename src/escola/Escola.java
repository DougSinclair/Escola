package escola;

import java.util.ArrayList;
import java.util.Scanner;    
public class Escola {

        public static void main(String args[]){

		/*Pessoa pes = new Pessoa("Douglas","themw63boss@outlook.com");
		pes.mostraDados();

		Aluno alun = new Aluno("Douglas","themw63boss@outlook.com",1911);
		alun.mostraDados();

		Professor prof = new Professor("André","dougblockdrift@gmail.com","Informática",5);
		prof.mostraDados();*/

		testaLista();
		mostraMenu();



  	}
	private static void mostraMenu() {
			
		}
	public static int testaLista(){
	

		ArrayList<String> listaAlunos = new ArrayList<String>();
		
		listaAlunos.add ("Doug");
		listaAlunos.add	("Vitor");
		listaAlunos.add ("Amanda");
		listaAlunos.add ("Dante");
		listaAlunos.add ("Putin");
		listaAlunos.add ("Vin");
		listaAlunos.add ("Marcus");
		listaAlunos.add ("Guilherme");
		listaAlunos.add ("Nick");
		listaAlunos.add ("Lauren");

		ArrayList<Integer> listaNotas = new ArrayList<Integer>();

		listaNotas.add (8);
		listaNotas.add (7);
		listaNotas.add (3);
		listaNotas.add (4);
		listaNotas.add (9);
		listaNotas.add (6);
		listaNotas.add (8);
		listaNotas.add (1);
		listaNotas.add (5);
		listaNotas.add (10);
		
		for (String n: listaAlunos){
			System.out.println (n);
		
		}
		for(Integer nota: listaNotas){
            System.out.println("O aluno " + listaAlunos.get(listaNotas.indexOf(nota)));
            if(nota >= 7){
                System.out.println("Ta Aprovado");
            }else {  
                System.out.println("Rodou");
               
                    public static void main(String[] args) {
                        Scanner l = new Scanner(System.in);
                        System.out.println("Cadastro de alunos e professores");
                        System.out.println("Digite os dados: "+"\nNome ");
                        String nome = l.nextLine();
                        System.out.println("Login required ");
                        String login = l.nextLine();
                        System.out.println("ocupação");
                        String cargo = l.nextLine();
                        System.out.println("Senha");
                        int senha = l.nextInt();
                        Dados usuario;
                        usuario = new Dados();
                        usuario.setNome(nome);
                        usuario.setLogin(login);
                        usuario.setCargo(ocupacao);
                        ArrayList<Dados> usuarios = new ArrayList<Dados>();
                        usuarios.add(usuario);
                        System.out.println(usuario.getNome()+"\n"+usuario.getLogin()+"\n"+usuario.getCargo());
            }
            

      }
		return 0;
	}
	
}
       

       

