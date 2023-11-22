package agregacao;

public class Produto {

    private Long codigoProduto;

    private String nomeProduto;

    private  Double preco;

    public Long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(Long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
//    private  int tamanho;

    public void vendido(){
 System.out.println(" Vendido ");
    }
}
