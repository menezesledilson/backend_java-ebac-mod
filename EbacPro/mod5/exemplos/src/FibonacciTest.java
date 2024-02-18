import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciWithZero() {
        int result = Fibonacci.fibonacci(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacciWithSmallNumber() {
        int result = Fibonacci.fibonacci(5);
        assertEquals(5, result);
    }

    @Test
    public void testFibonacciWithLargeNumber() {
        int result = Fibonacci.fibonacci(10);
        assertEquals(55, result);
    }
}
