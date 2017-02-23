package pl.sda.exception;

/**
 * Created by RENT on 2017-02-23.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            calculator.divide(5, 0);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        }
    }
}
