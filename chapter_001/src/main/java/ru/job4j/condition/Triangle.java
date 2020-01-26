package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        double first = ab + ac;
        double second = ac + bc;
        double third = ab + bc;
        boolean condition = ((first > bc)&&(second > ab)&&(third > ac));
        boolean result = condition ? true : false;
        return result;
    }
}