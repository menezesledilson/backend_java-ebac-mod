package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class AllTests {
    @RunWith(Suite.class)
    @SuiteClasses({PrimeiroTest.class, SegundoTest.class})
    public class AllTest {
    }
}
