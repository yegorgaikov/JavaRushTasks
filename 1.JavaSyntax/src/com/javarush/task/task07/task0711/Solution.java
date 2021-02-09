package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i=0; i<5; i++){
            String string = reader.readLine();
            arrayList.add(string);
        }

        for (int i = 0; i<13; i++){
            String s = arrayList.get(4);
            arrayList.remove(4);
            arrayList.add(0, s);
        }

        for (String s : arrayList)
            System.out.println(s);
    }
}

/*
дедушка
бабушка
дочь
программа
машина
 */