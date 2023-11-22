package saque;

import javax.naming.LimitExceededException;

public class ExemploThrow {

    public static void saque (double valor) throws  LimiteSaqueException {
        if(valor > 400 ){
            LimiteSaqueException erro = new LimiteSaqueException("Valor solicitado é maior que seu limite diario.");
            throw erro;

        } else {
            System.out.println("Valor retirado da conta: R$ " +valor);

        }
    }
    public  static void saqueRuntineException(double valor){
        if( valor > 400){
            IllegalAccessError erro =
                    new IllegalAccessError("Valor solicitado é maior que seu limite diário.");

            throw erro;
        } else {
            System.out.println("Valor retirado da conta R$" +valor);
        }
    }

    public static void saqueRuntimeException(int i) {
        
    }
}
