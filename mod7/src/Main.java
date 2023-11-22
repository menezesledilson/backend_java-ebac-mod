/**
 *
 * @autor Lincoln
 *
 * */
public class Main {
    public static void main(String[] args) {
        AlunoEbac aluno = new AlunoEbac();
        aluno.setNome("Lincoln");
        aluno.setIdade(28);
        aluno.setCursoMatriculado("Especialista Java Back-end");
        aluno.tbc(aluno.getNome());
    }
}