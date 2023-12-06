package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int amountOfElements = 100;

        Function function = new Function(amountOfElements);
        BigDecimal bigDecimal = function.division();

        WriterInFile writerInFile = new WriterInFile();
        writerInFile.write(bigDecimal.toString());
    }
}