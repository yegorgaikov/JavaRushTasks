package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой
стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами
проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.

Требования:
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных
элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных
элементов массива больше суммы нечетных.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summaEven = 0; // Even - четные
        int summaOdd = 0; // Odd - не четные

        int [] array = new int [15];

        for (int nomerDoma = 0; nomerDoma < array.length; nomerDoma++){
            int chisloJitelei = Integer.parseInt(reader.readLine());
            array [nomerDoma] =  chisloJitelei;

            if(nomerDoma%2 != 0){
                summaOdd = summaOdd + array[nomerDoma];
            }
            else {
                summaEven = summaEven + array[nomerDoma];
            }
        }

        if (summaEven>summaOdd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (summaOdd>summaEven){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
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
12
45
42
98
98
71
 */