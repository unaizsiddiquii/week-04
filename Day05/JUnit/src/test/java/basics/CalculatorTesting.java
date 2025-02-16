package basics;

import com.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTesting {

    //addition testing
    @Test
    public void addTest() {
        int actual = Calculator.add(23, 34);
        int expected = 57;
        Assertions.assertEquals(expected, actual);
    }

    //subtracting testing
    @Test
    public void subtractTest() {
        int actual = Calculator.subtract(43, 28);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    //multiplication testing
    @Test
    public void multiplyTest() {
        int actual = Calculator.multiply(88, 16);
        int expected = 1408;
        Assertions.assertEquals(expected, actual);
    }

    //divide test
    @Test
    public void divideTest() {
        int actual = Calculator.divide(36, 6);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    //divide test case with exception
    @Test
    public void divideTest2() {

        //handle the exception to divide method
        Assertions.assertThrows(Exception.class, () -> {
            int actual = Calculator.divide(7, 0);
            System.out.println("Exception is handled");

        });
    }

}
