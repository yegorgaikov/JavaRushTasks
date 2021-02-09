package com.javarush.task.task04.task0428;

/* 
Положительное число
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить количество положительных чисел в исходном наборе.
4. Если положительных чисел нет, программа должна вывести "0".
5. Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int count = 0;

        if (a>0)
            count++;
        if (b>0)
            count++;
        if (c>0)
            count++;

        System.out.println(count);

    }
}
