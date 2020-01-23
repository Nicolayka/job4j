package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
//import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void distance() {
        int x1 = 140;
        int y1 = 56;
        int x2 = 12;
        int y2 = 388;
        double expected = 355;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 1.0);
    }
}
