import java.util.ArrayList;
import java.util.List;

public class next {

        public static void main(String[] args) {
            List<Aluno> listAluno = new ArrayList<Aluno>();
            listAluno.add(new Aluno("Kleiton Rodrigues", 25, 8));
            listAluno.add(new Aluno("Renato Silva", 28, 9));
            listAluno.add(new Aluno("Joao Silva", 30, 10));

            int somaIdades = 0;
            double somaNotas = 0;
            String maiorAluno = null;

            double maiorNota = 0;
            for (Aluno aluno : listAluno){
                if(aluno.getNota() > maiorNota){
                    maiorNota = aluno.getNota();
                    maiorAluno = aluno.getNome();
                    somaNotas = aluno.getNota();
                }
                somaNotas += aluno.getNota();
                somaIdades += aluno.getIdade();
            }
            System.out.println("maiorNota = " + maiorNota);
            System.out.println("maiorAluno = " + maiorAluno);
            System.out.println("somaIdades = " + somaIdades);
            System.out.println("somaNotas = " + somaNotas);
        }
    }

