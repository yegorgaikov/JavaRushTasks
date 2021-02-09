package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения

Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из
10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map <String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Петров", "Роман");
        map.put("Скориков", "Сергей");
        map.put("Привало", "Роман");
        map.put("Привалов", "Александр");
        map.put("Кобзев", "Владимир");
        map.put("Зубова", "Александр");
        map.put("Макина", "Татьяна");
        map.put("Зубов", "Александр");
        map.put("Собянин", "Сергей");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;

        for (Map.Entry <String, String> entry : map.entrySet()){
            if ((entry.getValue()).equals(name)){
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;

        for (Map.Entry <String, String> entry : map.entrySet()){
            if ((entry.getKey()).equals(lastName)){
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
    }
}
