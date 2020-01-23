package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double heightman) {
        return (heightman - 100) * 1.15;
    }

    public static double womanWeight(double heightwoman) {
        return (heightwoman - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(184);
        double woman = womanWeight(150);
        System.out.println("Для мужчины с ростом 184, вес должен быть " + man + " кг.");
        System.out.println("Для женщины с ростом 150, вес должен быть " + woman + " кг.");
    }
}