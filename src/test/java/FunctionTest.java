import org.example.Function;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
public class FunctionTest {

    @Test
    public void testDivision() {
        int amountOfElements = 10;
        Function function = new Function(amountOfElements);
        BigDecimal result = function.division();
        BigDecimal expected = new BigDecimal("0.0012");
        assertEquals(expected, result);
    }
}
