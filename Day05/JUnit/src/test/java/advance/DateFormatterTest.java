package advance;

import com.advance.DateFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    @Test
    public void testValidDateConversion() {
        // Test valid date conversion
        String result = DateFormatter.formatDate("2024-02-18");
        Assertions.assertEquals("18-02-2024", result);
    }

}
