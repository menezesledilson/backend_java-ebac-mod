package saque;

import javax.naming.LimitExceededException;

public class AppExemploThrow {
    public static void main (String[]args){
        exception();
        runtimeException();

    }
    private  static void runtimeException(){

        ExemploThrow.saqueRuntimeException(500);
    }
    private static void exception (){
        try{
            ExemploThrow.saque(500);
        } catch (LimiteSaqueException e) {
            throw new RuntimeException(e);
        }
    }
}
