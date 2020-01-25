package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        double first = ab + ac;
        double second = ac + bc;
        double third = ab + bc;
        boolean result = true;

        //String rsl = "Треугольник не существует";
        if ((first > bc)&&(second > ab)&&(third > ac)){
            System.out.println("Треугольник существует!");
        } else {
            System.out.println("Треугольник не существует");
        }
        return result;
    }
}