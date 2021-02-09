package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.

Требования:
1. Программа должна выводить числа на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать два метода.
4. Метод sort() должен сортировать массив чисел от большего к меньшему.
5. Метод main() должен вызывать метод sort().
6. Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    //метод пузырьком

    public static void sort(int[] array) {
        boolean isSort = false;
        while (! isSort){
            isSort = true;
            for (int i = 0; i < array.length-1; i++){
                int temp;
                if (array [i] < array [i+1]){
                    isSort = false;

                    temp = array[i+1];
                    array[i+1] = array [i];
                    array[i] = temp;
                }
            }
        }

    }
}

/*
19
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
