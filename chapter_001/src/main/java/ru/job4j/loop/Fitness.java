package ru.job4j.loop;

public class Fitness {
    public static int calc (int ivan, int nick){
        int month = 0;
        while (ivan < nick){
            ivan = ivan * 3;
            nick *=2;
            month += 1;
        }
        return month;
    }
}