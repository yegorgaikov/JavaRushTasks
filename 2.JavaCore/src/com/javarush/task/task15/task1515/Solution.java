package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2 - Medium

В этой задаче тебе нужно:
1. В статическом блоке считать с консоли А и В — две переменные с типом int.
2. Обработать IOException в блоке catch.
3. Закрыть поток ввода методом close().

Требования:
1. Поле A должно быть публичным и статическим.
2. Поле B должно быть публичным и статическим.
3. Программа должна считывать данные с клавиатуры в статическом блоке.
4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
5. Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.
*/

public class Solution {
    public static int A;
    public static int B;

    static
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
