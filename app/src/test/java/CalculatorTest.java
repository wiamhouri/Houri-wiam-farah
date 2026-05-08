
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testCalc() {
        Calculator c = new Calculator();

        double result = c.calculate(2, 3);

        assertEquals(0.8333, result, 0.0001);
    }
}