package com.assignment2Q1;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;
import java.lang.*;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static junit.framework.Assert.fail;

/**
 * Created by Ernst on 2017/03/24.
 */
public class CalculatorTest{

    @Before
    public void setUp() throws Exception {
        System.out.println("In Before Class");

    }

    @Test
    public void testFloatingPoint() throws Exception {

        Calculator cal = new Calculator();

        Assert.assertEquals(20.0, cal.fAdd(10.0,10.0));

    }

    @Test
    public void testIntegers() throws Exception {

        Calculator cal = new Calculator();
        Calculator cal2 = new Calculator();

        int num1 = cal.iAdd(2,2);

        Assert.assertFalse(num1 > cal2.iAdd(4,4));
    }

    @Test
    public void testObjectEquality() throws Exception {

        Calculator cal = new Calculator();
        Calculator cal2 = new Calculator();

        Assert.assertEquals(cal.fDivide(4,2), cal2.fDivide(4,2));
    }

    @Test
    public void testObjectIdentity() throws Exception {

        Calculator cal = new Calculator();
        Calculator cal2 = new Calculator();

        Assert.assertSame(cal.identity("identity"), cal2.identity("identity"));
    }

    @Test
    public void testTruth() throws Exception {

        Calculator cal = new Calculator();

        Assert.assertTrue(4 > cal.iMultiply(2,1));
    }

    @Test
    public void testFalse() throws Exception {

        Calculator cal = new Calculator();

        Assert.assertFalse(2 > cal.iBiggerThan(4,2));
    }

    @Test
    public void testNullness() throws Exception {

        Calculator cal = null;

        Assert.assertNull(cal);
    }

    @Test
    public void testNonNullness() throws Exception {

        Calculator cal = new Calculator();

        Assert.assertNotNull(cal);
    }

    @Test(expected = AssertionFailedError.class)
    public void testFailing() throws Exception {

        Calculator cal = new Calculator();

        Assert.assertFalse(2 < cal.iBiggerThan(4, 2));
        fail("Exception not thrown");
    }

    @Test(expected = ArithmeticException.class)
    public void testExceptions() throws Exception {

        int num1 = 2;
        int num2 = 0;
        int sum;

        sum = num1/num2;

        /*try {
            sum = num1 / num2;
        }catch(ArithmeticException e)
        {
            System.out.println("Can't divide by Zero");
        }*/

    }

    @Test(timeout = 100)
    public void testTimeouts() throws Exception {

        Calculator cal = new Calculator();

        int num1 = 4;
        int num2 = 2;

        System.out.println("Multiplication: " + cal.iMultiply(num1, num2));

    }

    @Ignore
    public void testDisablingTest() throws Exception {

        Calculator cal = new Calculator();

        int num1 = 4;
        int num2 = 2;

        cal.iMultiply(num1, num2);
    }

    @Test
    public void testArraysContent() throws Exception {

        int[] arr = new int[2];

        arr[0] = 4;
        arr[1] = 4;

        Assert.assertEquals(arr[0], arr[1]);
    }

}