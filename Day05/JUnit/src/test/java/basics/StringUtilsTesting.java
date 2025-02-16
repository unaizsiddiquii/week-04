package basics;

import com.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTesting {

    @Test
    public void reverseTest() {
        String str = "hello world";
        String actual = StringUtils.reverse(str);
        String expected = "dlrow olleh";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromeTest() {
        String str = "wow";
        boolean actual = StringUtils.isPalindrome(str);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void isPalindromeTest2() {
        String str = "hello";
        boolean actual = StringUtils.isPalindrome(str);
        Assertions.assertFalse(actual);


    }

    @Test
    public void upperCaseTest() {
        String str = "hello world";
        String actual = StringUtils.toUpperCase(str);
        String expected = str.toUpperCase();
        Assertions.assertEquals(expected, actual);

    }
}
