package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition1 = first > second; //сравниваем first и second числа
        int result1 = condition1 ? first : second; //если в condition1 first > second, то возвращаем first, иначе возвращаем second

        boolean condition2 = result1 > third; //сравниваем предыдущий резудьтат сравнения с третим числом third
        int result2 = condition2 ? result1 : third; //если в condition2 предыдущий результат оператора condition1 (неважно какой first или second) больше числа third, то выводим result1, иначе выводим число third

        return result2;
    }
}