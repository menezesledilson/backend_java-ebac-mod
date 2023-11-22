package map;

import domain.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaAula {

    public static void main(String[] args) {
        Map<Integer, List<Aluno>> listaSalas = new HashMap<>();

        List<Aluno> alunosSala1 = criarTurma("Sala 1", 10);
        listaSalas.put(1, alunosSala1);

        List<Aluno> alunosSala2 = criarTurma("Sala 2", 30);
        listaSalas.put(2, alunosSala2);

        imprimirAlunosSala(listaSalas.get(1));
    }


    private static List<Aluno> criarTurma(String sala, int quantidade) {
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            Aluno aluno = new Aluno("Aluno " + i, " Curso " + i, i, sala);
            alunos.add(aluno);
        }
        return alunos;
    }

    private static void imprimirAlunosSala(List<Aluno> alunos) {
        //For java 8 api stream

        System.out.println("For java 8 API stream");
        alunos.forEach(aluno -> System.out.println(" Nome: " + aluno.getNome() + " Sala " + aluno.getSala()));
        System.out.println("");

        System.out.println("for Java");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
        System.out.println("");

        System.out.println("for Java com contador");
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
    }
}
