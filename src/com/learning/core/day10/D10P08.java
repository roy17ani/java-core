package com.learning.core.day10;
import org.junit.Assert;
import org.junit.Test;

public class D10P08 {

	public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    @Test
    public void testAdd() {
        D10P08 calculator = new D10P08();
        int result = calculator.add(3, 5);
        Assert.assertEquals(8, result); // Expected result is 8 (3 + 5)
    }

    @Test
    public void testSub() {
        D10P08 calculator = new D10P08();
        int result = calculator.sub(8, 3);
        Assert.assertEquals(5, result); // Expected result is 5 (8 - 3)
    }

    @Test
    public void testMul() {
        D10P08 calculator = new D10P08();
        int result = calculator.mul(3, 4);
        Assert.assertEquals(12, result); // Expected result is 12 (3 * 4)
    }

    @Test
    public void testDiv() {
        D10P08 calculator = new D10P08();
        int result = calculator.div(10, 2);
        Assert.assertEquals(5, result); // Expected result is 5 (10 / 2)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() {
        D10P08 calculator = new D10P08();
        calculator.div(10, 0); // Division by zero should throw IllegalArgumentException
    }
}