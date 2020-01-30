package ru.job4j.condition;

public class SqMax {
    /*public static void main(String[] args) {
        System.out.println(max(8,4,9,5));
    }*/
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        /*if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                }
            } else if (third > forth) { //или можно сделать вот так, если дописать условие <<<-------
                result = third;
            }
        }*/
        if ((first > second) && (first > third)) {
                if (first > forth) {
                    result = first;
                }
            } else if (third > forth) {
                result = third;
            } else if (second > third) {
            if (second > forth) {
                result = second;
            }
        } else if (third > forth) {
            result = third;
        }
        return result;
    }
}