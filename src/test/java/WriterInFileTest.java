
import org.example.WriterInFile;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class WriterInFileTest {

    @Test
    public void testWrite() throws IOException {
        String fileName = "result.txt";
        WriterInFile writerInFile = new WriterInFile();
        String content = "Test content";
        writerInFile.write(content);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String fileContent = reader.readLine();
            assertEquals(content, fileContent);
        }
    }

}
