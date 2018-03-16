 public class Professor extends Pessoa{

    private int cargaHora = 0;
    private String disciplina = "";

        public void setCargaHra(int hora){
            this.Carga = hora;
        }

        public void mostraDadosProf(){
            System.out.println("\n Dados do Professor\n Nome: "+ nome +"\n Email: "+ email +"\n Carga Horaria em Horas: "+ cargaHora +"\n Disciplina: "+ disciplina);
        }
}
