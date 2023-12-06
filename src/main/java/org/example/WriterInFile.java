package org.example;

import java.io.*;

public class WriterInFile {
    String fileName = "result.txt";
    public void write(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
