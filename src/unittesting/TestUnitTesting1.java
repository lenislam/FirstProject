package unittesting;

import org.junit.Test;

public class TestUnitTesting1 {

    @Test
    public void testUnit(){
        Calculator.doSummation();
    }
    @Test
    public void testUnit1(){
        Calculator.doSubtraction(20,50);
    }
}
