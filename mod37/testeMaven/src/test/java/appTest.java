import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class appTest {
    @Test
    public void testHelloWorld() {
        assertEquals("Hello world!", getHelloWorldMessage());
    }

    private String getHelloWorldMessage() {
        return "Hello world!";
    }
}

