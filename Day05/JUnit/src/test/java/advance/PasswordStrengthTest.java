package advance;

import com.advance.PasswordStrength;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthTest {

    @ParameterizedTest()
    @ValueSource(strings = {"Password1", "Hello123", "Secure9X"})
    public void passwordValidatorTest(String password) {
        Boolean isValid = PasswordStrength.PasswordValidator(password);
        Assertions.assertEquals(true, isValid);
        if (!isValid) {
            throw new AssertionError("Invalid Password Strength");
        }
    }

    @ParameterizedTest()
    @ValueSource(strings = {"password", "abc", "12345"})
    public void passwordValidatorTest2(String password) {
        Boolean isValid = PasswordStrength.PasswordValidator(password);
        Assertions.assertFalse(isValid);
        if (!isValid) {
            throw new AssertionError("Invalid Password Strength");
        }
    }


}

