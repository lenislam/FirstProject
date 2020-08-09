package unittesting;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestUnitTesting {
    // Test case Method
    // Before method >>>> Test case method >>> After method
@Before
    public void welCome(){
        System.out.println("WelCome");
    }
    @Ignore
    public void testUnit(){
        Calculator.doSummation();
    }
//    @Test
//    public void testUnit(){
//        Calculator.doSummation();
//    }
    @After
    public void goodBuy(){
        System.out.println("Good Buy");
    }
@Test
    public void testUnit1(){
        Calculator.doSubtraction(20,50);
    }
}
