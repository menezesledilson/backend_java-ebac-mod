public class AlunoEbac extends Pessoa{
    public String acessoPlataforma;
    public String cursoMatriculado;
    public String getAcessoPlataforma() {
        return acessoPlataforma;
    }

    public void setAcessoPlataforma(String acessoPlataforma) {
        this.acessoPlataforma = acessoPlataforma;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    /*TBC: Tempo de Bunda na Cadeira para os estudos*/
    public void tbc(String nome){
        System.out.println(nome + " está dedicando um tempo para estudar");
    }
    
}
