public class ContaCorrente  extends  ContaBancaria{

    private int limite;

    public ContaCorrente(int saldo, int limite) {
        super(saldo);
        this.limite = limite;
    }
    public boolean temSaldoSuficienteParaDebitar(int saldoAnterior){
        if(saldo + limite >= saldoAnterior){
            return  true;

        }
        return false;
    }
}
