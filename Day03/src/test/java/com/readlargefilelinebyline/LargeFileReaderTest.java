package com.readlargefilelinebyline;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LargeFileReaderTest {

    @Test
    void testReadFileAndFilterErrors() throws IOException {
        // Create a temporary test file
        File tempFile = File.createTempFile("testLargeFile", ".txt");
        // Write sample data to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("This is a normal line.\n");
            writer.write("An ERROR occurred in the system.\n");
            writer.write("Another normal line.\n");
            writer.write("Critical Error detected!\n");
        }

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Run the method
        LargeFileReader.readFileAndFilterErrors(tempFile.getAbsolutePath());

        // Restore System.out
        System.setOut(originalOut);

        // Verify the output contains the expected lines
        String output = outputStream.toString();
        assertTrue(output.contains("An ERROR occurred in the system."));
        assertTrue(output.contains("Critical Error detected!"));
    }
}

