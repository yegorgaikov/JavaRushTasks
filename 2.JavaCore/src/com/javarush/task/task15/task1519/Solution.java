package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов - Hard

В этой задаче тебе нужно:
1. Считывать с консоли данные, пока не будет введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print(). Если значение:
содержит точку '.', вызвать метод print() для Double;
больше нуля, но меньше 128, вызвать метод print() для short;
меньше либо равно нулю или больше либо равно 128, вызвать метод print() для Integer;
иначе — вызвать метод print() для String.

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные с клавиатуры после того, как введена строка "exit".
3. Если введенная строка содержит точку("."), и ее можно корректно преобразовать в число типа Double - должен быть
вызван метод print(Double value).
4. Если введенная строка может быть корректно преобразована в число типа short и полученное число больше 0, но
меньше 128 - должен быть вызван метод print(short value).
5. Если введенная строка может быть корректно преобразована в число типа Integer и полученное число меньше или
равно 0 или больше или равно 128 - должен быть вызван метод print(Integer value).
6. Во всех остальных случаях должен быть вызван метод print(String value).
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String value = reader.readLine();

            if (value.equals("exit")) {
                break;
            }

            Pattern pattern1 = Pattern.compile("\\d");
            Pattern pattern2 = Pattern.compile("(\\d*\\.)\\d+");
            Matcher matcher1 = pattern1.matcher(value);
            Matcher matcher2 = pattern2.matcher(value);

            if (matcher2.find()) {
                print(Double.parseDouble(value));
            } else if (matcher1.find()) {
                int i = Integer.parseInt(value);

                if (i > 0 && i < 128) {
                    print(Short.parseShort(value));
                } else {
                    print(i);
                }

            } else {
                print(value);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}