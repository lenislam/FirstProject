package unittesting;



import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuiteRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuit.class); // Create a reference variable which from JUnit
        for(Failure failure:result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
