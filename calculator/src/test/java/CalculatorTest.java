import static com.manognya.Calculator.*;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    // Test cases for square root
    @Test
    public void testSquareRootWholenumber() {
        double result = SquareRoot(25);
        Assert.assertEquals(5.0, result, 0.0001);
    }
    @Test
    public void testSquareRootZero() {
        double result = SquareRoot(0);
        Assert.assertEquals(0.0, result, 0.0001);
    }
    @Test
    public void testSquareDecimal() {
        double result = SquareRoot(6.25);
        Assert.assertEquals(2.5, result, 0.0001);
    }
    @Test
    public void testSquareNegative() {
        try {
            SquareRoot(-5);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    // testcases for factorial
    
    @Test
    public void testFactorialWholenumber() {
        double result = Factorial(5);
        Assert.assertEquals(120, result, 0.0001);
    }
    @Test
    public void testFactorialRootZero() {
        double result = Factorial(0);
        Assert.assertEquals(1, result, 0.0001);
    }

    @Test
    public void testFactorialNegative() {
        try {
            Factorial(-5);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    // test cases for log
    @Test
    public void testlogOne() {
        double result = NaturalLog(1);
        Assert.assertEquals(0, result, 0.0001);
    }
    @Test
    public void testlogE() {
        double result = NaturalLog(Math.E);
        Assert.assertEquals(1, result, 0.0001);
    }

    @Test
    public void testlogNegative() {
        try {
            NaturalLog(-5);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    
}
