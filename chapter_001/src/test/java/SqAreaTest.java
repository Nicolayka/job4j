package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
//import ru.job4j.condition.SqArea;

public class SqAreaTest {
    @Test
    public void square() {
        int p = 100;
        int k = 6;
        double expected = 294;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.1);
    }
}
