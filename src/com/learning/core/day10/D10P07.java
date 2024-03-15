package com.learning.core.day10;
import org.junit.Assert;
import org.junit.Test;

public class D10P07 {
	public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    @Test
    public void testAdd() {
        D10P07 calculator = new D10P07();
        int result = calculator.add(3, 5);
        Assert.assertEquals(8, result); // Expected result is 8 (3 + 5)
    }

    @Test
    public void testSub() {
        D10P07 calculator = new D10P07();
        int result = calculator.sub(8, 3);
        Assert.assertEquals(5, result); // Expected result is 5 (8 - 3)
    }
}