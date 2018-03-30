package escola;

import java.util.ArrayList;    
public class Escola {

        public static void main(String args[]){

		/*Pessoa pes = new Pessoa("Douglas","themw63boss@outlook.com");
		pes.mostraDados();

		Aluno alun = new Aluno("Douglas","themw63boss@outlook.com",1911);
		alun.mostraDados();

		Professor prof = new Professor("André","dougblockdrift@gmail.com","Informática",5);
		prof.mostraDados();*/

		testaLista();



  	}
	public static void testaLista(){
	

		ArrayList<String> listaAlunos = new ArrayList<String>();
		
		listaAlunos.add ("Doug");
		listaAlunos.add	("Vitor");
		listaAlunos.add ("Amanda");
		listaAlunos.add ("Bananinha");
		listaAlunos.add ("Putin");
		listaAlunos.add ("Vin");
		listaAlunos.add ("Marcus");
		listaAlunos.add ("Lara");
		listaAlunos.add ("João");
		listaAlunos.add ("Ana");

		ArrayList<Integer> listaNotas = new ArrayList<Integer>();

		listaNotas.add (5);
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
            }else  
                System.out.println("Rodou");
		} 
	}
}


