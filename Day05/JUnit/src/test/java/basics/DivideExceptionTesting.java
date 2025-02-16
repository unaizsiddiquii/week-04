package basics;

import com.Calculator;
import com.DivideException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivideExceptionTesting {
    @Test
    public void divideTest() {
        int actual = DivideException.divide(36, 6);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    //divide test case with exception
    @Test
    public void divideTest2() {

        //handle the exception to divide method
        Assertions.assertThrows(Exception.class, () -> {
            int actual = DivideException.divide(7, 0);

        });
        System.out.println("Exception is handled");
    }
}
