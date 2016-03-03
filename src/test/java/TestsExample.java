import org.junit.Test;
import static org.junit.Assert.*;

public class TestsExample {

    @Test
    public void testTestClass() {

        TestClass testClass = new TestClass();

        assertTrue("should return true", testClass.someTestMethod(true));

        assertTrue(!testClass.someTestMethod(false));
    }
}
