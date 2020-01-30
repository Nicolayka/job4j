package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void max1() {
        //int result = SqMax.max(8,4,9,5);
        int first = 4;
        int second = 1;
        int third = 2;
        int forth = 3;
        int expected = 333;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out, 0);
    }
    @Test
    public void max2() {
        //int result = SqMax.max(8,4,9,5);
        int first = 10;
        int second = 13;
        int third = 11;
        int forth = 12;
        int expected = 333;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out, 0);
    }
    @Test
    public void max3() {
        //int result = SqMax.max(8,4,9,5);
        int first = 15;
        int second = 16;
        int third = 18;
        int forth = 17;
        int expected = 333;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out, 0);
    }
    @Test
    public void max4() {
        //int result = SqMax.max(8,4,9,5);
        int first = 20;
        int second = 30;
        int third = 40;
        int forth = 50;
        int expected = 333;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out, 0);
    }
    @Test
    public void equally() {
        //int result = SqMax.max(8,4,9,5);
        int first = 100;
        int second = 100;
        int third = 100;
        int forth = 100;
        int expected = 333;
        int out = SqMax.max(first, second, third, forth);
        Assert.assertEquals(expected, out, 0);
    }
}
