package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
1. Не изменяй заголовок метода createSet().
2. Программа не должна выводить текст на экран.
3. Программа не должна считывать значения с клавиатуры.
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Лимон");
        hashSet.add("Лайм");
        hashSet.add("Лампа");
        hashSet.add("Луна");
        hashSet.add("Ливерпуль");
        hashSet.add("Лес");
        hashSet.add("Лев");
        hashSet.add("Лемур");
        hashSet.add("Лион");
        hashSet.add("Лондон");
        hashSet.add("Лимонад");
        hashSet.add("Лыхны");
        hashSet.add("Лангетка");
        hashSet.add("Лук");
        hashSet.add("Лупа");
        hashSet.add("Лада");
        hashSet.add("Лена");
        hashSet.add("Ломоносов");
        hashSet.add("Лодка");
        hashSet.add("Лубрикант");
        return hashSet;
    }

    public static void main(String[] args) {

    }
}
