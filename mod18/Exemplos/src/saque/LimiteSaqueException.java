package saque;

import javax.naming.LimitExceededException;

public class LimiteSaqueException extends Exception{
    public LimiteSaqueException(String msg) {super(msg);}
}
