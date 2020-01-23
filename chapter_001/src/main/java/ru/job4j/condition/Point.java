package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        /*double f = (x2 - x1);
        double f1 = (y2 - y1);
        double f2 = Math.pow(f, 2);
        double f3 = Math.pow(f1, 2);
        double d = f2 + f3;;
        double d1 = Math.sqrt(d);
        return d1;*/
        double f = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return f;
    }

    public static void main(String[] args) {
        double result = distance(5,5,3,3);
        double result1 = distance(2,3,4,6);
        System.out.println("result (5, 5) to (3, 3) " + result);
        System.out.println("result (2, 3) to (4, 6) " + result1);
    }
}
