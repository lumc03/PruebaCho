package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LogIn.class,
        CustomerRegistration.class
        }
)

public class SuiteTest {

}
