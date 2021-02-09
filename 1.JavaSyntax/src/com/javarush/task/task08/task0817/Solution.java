package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих
из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map <String, String > map = new HashMap<>();

        map.put("Привалов", "Александр");
        map.put("Иванов", "Иван");
        map.put("Петров", "Роман");
        map.put("Сысоев", "Роман");
        map.put("Сергеев", "Сергей");
        map.put("Сидорова", "Мария");
        map.put("Баринов", "Александр");
        map.put("Кузнецов", "Александр");
        map.put("Малышева", "Елена");
        map.put("Крылов", "Сергей");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map <String, String> copy = new HashMap<>(map);
        Set <String> set = new HashSet<>();
        for (Map.Entry <String, String> pairMap : map.entrySet()){
            int count = 0;
            for (Map.Entry <String, String> pairCopy : copy.entrySet()){
                if(pairMap.getValue().equals(pairCopy.getValue())){
                    count++;
                }
            }

            if (count > 1){
                set.add(pairMap.getValue());
            }
        }

        for(String s : set){
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
