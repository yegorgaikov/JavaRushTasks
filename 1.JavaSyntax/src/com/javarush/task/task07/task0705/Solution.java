package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
1. Программа должна создавать большой массив на 20 целых чисел.
2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
3. Программа должна создавать два маленьких массива на 10 чисел каждый.
4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести
второй маленький массив на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] arrayBig = new int [20];
        for (int i = 0; i<arrayBig.length; i++){
            arrayBig [i] = Integer.parseInt(reader.readLine());
        }

        int [] arraySmall_1 = new int [10];
        int [] arraySmall_2 = new int [10];

        for (int j = 0; j < arrayBig.length; j++){
            int dlinaBig = arrayBig.length;
            if (j<dlinaBig/2){
                arraySmall_1 [j] = arrayBig[j];
            }
            else {
                arraySmall_2[j-dlinaBig/2] = arrayBig[j];
            }
        }

        for (int x : arraySmall_2){
            System.out.println(x);
        }



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