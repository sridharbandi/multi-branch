package con.axone.devintest.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	SimpleJunitTest.class, AppUtilsTest.class, JUnitDemo.class
})

public class JUnitRunner {

}
