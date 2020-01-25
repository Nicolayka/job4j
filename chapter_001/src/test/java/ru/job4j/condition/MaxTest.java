package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax2() {
        int result = Max.max(1, 3);
        assertThat(result, is(1));
    }
    @Test
    public void whenMaxequaly() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
}