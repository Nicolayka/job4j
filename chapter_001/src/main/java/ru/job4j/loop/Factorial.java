package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1; //поменял с 0 на 1, так как раньше при умножении на 0 всегда поулчается 0!
        for ( int index = 1; index <= n; index++ ) {
            if (n == 0) {
                result = 1 ;
            } else {
                result = result * index;
            }
        }
        return result;
    }
}