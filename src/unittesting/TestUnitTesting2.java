package unittesting;

import org.junit.Assert;
import org.junit.Test;

public class TestUnitTesting2 {
//Test case Method

    @Test
    public void testUnit(){
        Calculator.doSummation();
    }

    @Test
    public void testUnit1() {
        //Calculator.doSubtraction(20,50);
        // Validate the expected result and Actual result
        int expectedResult = 10;
        int actualResult = Calculator.doSubtraction(20, 30);
        //Assert.assertEquals(expectedResult,actualResult); //Enter if statement is done by Assert Syntex
        Assert.assertEquals("Test case is failed", actualResult, expectedResult);
        //Assert.assertNotEquals("Not passed",actualResult,expectedResult);
    }
    @Test
    public void testUnit2() {
        //Calculator.doSubtraction(20,50);
        // Validate the expected result and Actual result
        int expectedResult = 9;
        int actualResult = Calculator.doSubtraction(20, 30);
        //Assert.assertEquals(expectedResult,actualResult); //Enter if statement is done by Assert Syntex
        Assert.assertEquals("Test case is failed", actualResult, expectedResult);
        //Assert.assertNotEquals("Not passed",actualResult,expectedResult);
    }
    @Test
        public void testUnit3(){
            Calculator.doMultiply(12,20);
        }
    }

