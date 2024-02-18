public class ContaBancaria {
     protected  int saldo;

     public  ContaBancaria(int saldo){
         this.saldo = saldo;
     }

    public boolean temSaldoSuficienteParaDebitar(int saldoAnterior) {
        return false;
    }
}
