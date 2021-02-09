package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить количество отрицательных чисел в исходном наборе.
4. Программа должна выводить количество положительных чисел в исходном наборе.
5. Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
6. Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
7. Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    /*    int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int pol = 0;
        int otric = 0;

        if (a>0)
            pol++;
        else if (a<0)
            otric++;

        if (b>0)
            pol++;
        else if (b<0)
            otric++;

        if (c>0)
            pol++;
        else if (c<0)
            otric++;

        System.out.println("количество отрицательных чисел: " + otric);
        System.out.println("количество положительных чисел: " + pol);
*/
        int positive = 0;
        int negative = 0;

        for (int i=0; i<3; i++){
            int a = Integer.parseInt(reader.readLine());
            if (a>0)
                positive++;
            else if (a<0)
                negative++;
        }

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
