package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] array  = new int [20];
        for (int i = 0; i < 20; i++){
            array [i] = Integer.parseInt(reader.readLine());
        }

        int maximum = array[0];
        int minimum = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] < minimum){
                minimum = array[i];
            }
            else if (array[i] > maximum) {
                maximum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}


/*
5
10
16
17
9
3
4
46
97
89
12
45
98
111
42
98
98
-9
71
-150
 */