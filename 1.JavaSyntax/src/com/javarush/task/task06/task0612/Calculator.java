package com.javarush.task.task06.task0612;

/* 
Калькулятор

Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)

Требования:
1. Метод plus должен возвращать сумму чисел a и b.
2. Метод minus должен возвращать разницу чисел a и b.
3. Метод multiply должен возвращать результат умножения числа a на число b.
4. Метод division должен возвращать результат деления числа a на число b.
5. Метод percent должен возвращать b процентов от числа a.
*/

public class Calculator {
    public static int plus(int a, int b) {
        int summa = a + b;
        return summa;
    }

    public static int minus(int a, int b) {
        int raznica = a - b;
        return raznica;
    }

    public static int multiply(int a, int b) {
        int proizvedenie = a*b;
        return proizvedenie;
    }

    public static double division(int a, int b) {
        double delenie = (double) a/ (double) b;
        return delenie;
    }

    public static double percent(int a, int b) {
        //(например, percent(4, 50) должен вернуть 50% от 4)
        double result =  a*b /100.0;
        return result;
    }

    public static void main(String[] args) {

    }
}