package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int EuroToRuble(int value) {
        return value * 70;
    }

    public static int DollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int inre = 140;
        int expectedre = 2;
        int outre = rubleToEuro(inre);
        boolean passedre = expectedre == outre;
        System.out.println("140 rubles are 2. Test result : " + passedre);

        int inrd = 120;
        int expectedrd = 2;
        int outrd = rubleToDollar(inrd);
        boolean passedrd = expectedrd == outrd;
        System.out.println("120 rubles are 2. Test result : " + passedrd);

        int iner = 2;
        int expecteder = 140;
        int outer = EuroToRuble(iner);
        boolean passeder = expecteder == outer;
        System.out.println("2 euro are 140. Test result : " + passeder);

        int indr = 2;
        int expecteddr = 120;
        int outdr = DollarToRuble(indr);
        boolean passeddr = expecteddr == outdr;
        System.out.println("2 dollars are 120. Test result : " + passeddr);
    }

/*    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(200);
        int eurotoruble = EuroToRuble(140);
        int dollartoruble = DollarToRuble(200);
        System.out.println("140 рублей это " + euro + " евро.");
        System.out.println("200 рублей это " + dollar + " долларов.");
        System.out.println("140 евро это " + eurotoruble + " рублей.");
        System.out.println("200 долларов это " + dollartoruble + " рублей.");
    }*/
}