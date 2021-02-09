package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
Напишите метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используйте метод public static int abs(int a), который возвращает абсолютную величину числа.

Требования:
1. Программа должна выводить числа на экран.
2. Метод main не должен вызывать System.out.println() или System.out.print().
3. Метод main должен вызывать метод displayClosestToTen.
4. Метод displayClosestToTen должен вызывать метод abs.
5. Метод displayClosestToTen должен выводить число на экран согласно заданию.
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int nearTen1 = 10-a;
        int nearTen2 = 10-b;
        Solution s1 = new Solution();

        if (s1.abs(nearTen1)<s1.abs(nearTen2)) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}