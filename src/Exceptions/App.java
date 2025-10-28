package Exceptions;

import java.io.FileReader;
import java.io.IOException;

class FileReaderExample {
    // Declares that this method can throw an IOException.
    public void readFile() throws IOException {
        FileReader reader = new FileReader("file.txt");
        // ... rest of the code
        reader.close();
    }
}

// In another class, the caller must handle the exception.
public class App {
    public static void main(String[] args) {
        FileReaderExample example = new FileReaderExample();
        try {
            example.readFile(); // The caller is now forced to handle the IOException.
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
