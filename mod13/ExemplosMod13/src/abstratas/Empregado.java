package abstratas;

public abstract class Empregado {

    private String nome;

    private String sobreNome;

    private String cpf;


  public  abstract  Double vencimento();

  public void imprimirSobrenome(){
      System.out.println("Sobrenome é " + this.sobreNome);
  }

  public  void imprimirValores(){
       Double valor = vencimento();
       System.out.println("Valores: " + valor);
  }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
