package basics;

import com.ParameterizedTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestsTesting {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void isEvenTest2(int number) {
        boolean expected = (number % 2 == 0);
        Assertions.assertEquals(expected, ParameterizedTests.isEven(number), number + " should be " + (expected ? "even" : "odd"));

    }
}
