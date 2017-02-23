package pl.sda.exception;

public class Calculator {
    public float divide(float a, float b) throws DivideByZeroException {
        if (b ==0) {
            throw new DivideByZeroException("Nie dziel przez )1");
        }
        return a/b;
    }


}
