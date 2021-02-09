package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция

Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.

Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать три метода.
4. Метод main() должен вызывать метод sort().
5. Метод sort() должен вызывать метод isGreaterThan().
6. Выведенные слова должны быть отсортированы в алфавитном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length-1; i++){
                if (isGreaterThan(array[i], array[i+1])){
                    isSorted = false;
                    String temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}


/*
Москва
Абрамовичи
Киев
Ивановы
Лондон
Петровы
Семь
Восемь
Девять
Десять
Новое
Старое
Три
Квадрат
Пять
Шесть
Самурай
Боль
Дом
Яблоко
 */