package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
3. Метод sumDigitsInNumber должен возвращать значение типа int.
4. Метод sumDigitsInNumber не должен ничего выводить на экран.
5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(638));
    }

    public static int sumDigitsInNumber(int number) {
        int n1 = number/100;
        int n21= number - n1*100;
        int n2 = n21/10;
        int n3 = n21 - n2*10;

        int sum = n1 + n2 + n3;
        return sum;
    }
}