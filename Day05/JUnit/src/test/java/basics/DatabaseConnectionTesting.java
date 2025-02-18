package basics;

import com.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTesting {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        Assertions.assertTrue(dbConnection.isConnected(), "Connection should be established");
    }

    @Test
    void testConnectionIsClosed() {
        dbConnection.disconnect();
        Assertions.assertFalse(dbConnection.isConnected(), "Connection should be closed");
    }

}
