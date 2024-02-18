public class ContaPoupança extends ContaBancaria{

    public ContaPoupança(int saldo) {
        super(saldo);
    }
    public boolean temSaldoSufucienteParaDebitar(int saldoDebitar){
        if(saldo >= saldoDebitar){
            return true;
        }
        return false;
    }
}
