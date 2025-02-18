package advance;

import com.advance.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    public void celsiusToFahrenheit() {
        double actual = TemperatureConverter.celsiusToFahrenheit(46);
        double expected = 114.8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fahrenheitToCelsius() {
        double actual = TemperatureConverter.fahrenheitToCelsius(110);
        double expected = 43.333333333333336;
        Assertions.assertEquals(expected, actual);
    }
}
