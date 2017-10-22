import java.util.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


//@RunWith(Suite.class)
//@Suite.SuiteClasses({TestForTwo.class,BoundaryTestForTwo.class,RandomTestForTwo.class})
public class TestAll {

    private static void runTestCase(Class testCase)
    {
        Result result = JUnitCore.runClasses(testCase);
        System.out.println("---------------------------");
        System.out.println(testCase.toString()+"\n");
        System.out.printf("Total run number: %d\n\n", result.getRunCount());
        System.out.printf("Total run time: %d\n\n",result.getRunTime());
        System.out.printf("failure count: %d\n\n",result.getFailureCount());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        generateRandomTest generateRandomTest = new generateRandomTest();
        generateRandomTest.generate();
        Map<Integer, Class<?>> classes = new HashMap<Integer, Class<?>>();;
        //Add test cases
        classes.put(1,ECTestForTwo.class);
        classes.put(2,BoundaryTestForTwo.class);
        classes.put(3,RandomTestForTwo.class);
        runTestCase(classes.get(1));
        runTestCase(classes.get(2));
        runTestCase(classes.get(3));
    }

}
