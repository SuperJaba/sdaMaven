package pl.sda.exception;

public class DivideByZeroException extends Throwable {
        public DivideByZeroException(String s){
            super(s);
        }
        public DivideByZeroException(String s,Throwable cause){
            super(s,cause);
        }
    }

