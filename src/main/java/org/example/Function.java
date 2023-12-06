package org.example;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Function {
   private final int amountOfElements;

    public Function(int amountOfElements) {
        this.amountOfElements = amountOfElements;
    }

    private BigInteger[] calculateBySequence(){
        BigInteger[] sequence = new BigInteger[amountOfElements];
        sequence[0] = BigInteger.valueOf(1);
        sequence[1] = BigInteger.valueOf(2);
        sequence[2] = BigInteger.valueOf(3);

        for (int i = 3; i < amountOfElements; i++) {
            sequence[i] = sequence[i - 3].subtract(sequence[i - 2]);
        }
        return sequence;
    }

    private BigInteger sumOfSequence(){
        BigInteger[] sequence = calculateBySequence();
        return Arrays.stream(sequence).reduce(BigInteger.ZERO, BigInteger::add);
    }

    public BigDecimal division(){
        BigDecimal divider = BigDecimal.valueOf(10000);
        return new BigDecimal(sumOfSequence().abs()).divide(divider);
    }

}
