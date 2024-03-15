package com.learning.core.day10;
import org.junit.Assert;
import org.junit.Test;
public class D10P09 {

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

    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    @Test
    public void testAdd() {
        D10P09 calculator = new D10P09();
        int result = calculator.add(3, 5);
        Assert.assertEquals(8, result); // Expected result is 8 (3 + 5)
    }

    @Test
    public void testSub() {
        D10P09 calculator = new D10P09();
        int result = calculator.sub(8, 3);
        Assert.assertEquals(5, result); // Expected result is 5 (8 - 3)
    }

    @Test
    public void testMul() {
        D10P09 calculator = new D10P09();
        int result = calculator.mul(3, 4);
        Assert.assertEquals(12, result); // Expected result is 12 (3 * 4)
    }

    @Test
    public void testDiv() {
        D10P09 calculator = new D10P09();
        int result = calculator.div(10, 2);
        Assert.assertEquals(5, result); // Expected result is 5 (10 / 2)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivByZero() {
        D10P09 calculator = new D10P09();
        calculator.div(10, 0); // Division by zero should throw IllegalArgumentException
    }

    @Test
    public void testFindMaxWithPositiveNumbers() {
        D10P09 arrayUtils = new D10P09();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = arrayUtils.findMax(arr);
        Assert.assertEquals(6, result); // Expected result is 6 (maximum element in the array)
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        D10P09 arrayUtils = new D10P09();
        int[] arr = {-1, -2, -3, -4, -5, -6};
        int result = arrayUtils.findMax(arr);
        Assert.assertEquals(-1, result); // Expected result is -1 (maximum element in the array)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        D10P09 arrayUtils = new D10P09();
        int[] arr = {};
        arrayUtils.findMax(arr); // Method should throw IllegalArgumentException for empty array
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullArray() {
        D10P09 arrayUtils = new D10P09();
        int[] arr = null;
        arrayUtils.findMax(arr); // Method should throw IllegalArgumentException for null array
    }
}