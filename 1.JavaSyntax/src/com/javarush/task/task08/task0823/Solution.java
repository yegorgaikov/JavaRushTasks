package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String space = " ";

        string = string.substring(0,1).toUpperCase() + string.substring(1, string.length());
        for (int i=1; i < string.length(); i++){
            if (string.substring(i-1,i).equals(space)){
                string = string.substring(0,i) + string.substring(i,i+1).toUpperCase() + string.substring(i+1,string.length());
            }
        }
        System.out.println(string);


          //или

        String s2 = "";
        s2 = string.substring(0,1).toUpperCase();
        for (int i=1; i < string.length(); i++){
            if (string.substring(i-1,i).equals(space)){
                s2 = s2 + string.substring(i,i+1).toUpperCase();
            }
            else{
                s2 = s2 + string.substring(i,i+1);
            }
        }
        System.out.println(s2);
    }
}

/*
мама мыла раму.
 */