package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов - Medium

Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен создавать новый объект HashMap<String, Cat>.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map <String, Cat> catsMap = new HashMap<>(10);

        catsMap.put("Барсик", new Cat("Барсик"));
        catsMap.put("Маркиз", new Cat("Маркиз"));
        catsMap.put("Алиса", new Cat("Алиса"));
        catsMap.put("Мурка", new Cat("Мурка"));
        catsMap.put("Котя", new Cat("Котя"));
        catsMap.put("Жозефина", new Cat("Жозефина"));
        catsMap.put("Шарик", new Cat("Шарик"));
        catsMap.put("Джерик", new Cat("Джерик"));
        catsMap.put("Матильда", new Cat("Матильда"));
        catsMap.put("Серый", new Cat("Серый"));

        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set <Cat> catsSet = new HashSet<>(10);

        catsSet.addAll(map.values());

        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
