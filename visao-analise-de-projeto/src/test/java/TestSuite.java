import calculator.TestSumCalculator;
import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestSumCalculator.class})
public class TestSuite {
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(TestSuite.class);
    }
}
