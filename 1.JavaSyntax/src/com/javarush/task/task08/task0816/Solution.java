package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
1) Программа не должна выводить текст на экран.
2) Программа не должна считывать значения с клавиатуры.
3) Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4) Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Map<String, Date> map = new HashMap<>();

        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Привалов", dateFormat.parse("APRIL 20 1994"));
        map.put("Скориков", dateFormat.parse("OCTOBER 8 1994"));
        map.put("Кобзев", dateFormat.parse("NOVEMBER 17 1994"));
        map.put("Иванов", dateFormat.parse("JULY 24 2012"));
        map.put("Петров", dateFormat.parse("JANUARY 21 2005"));
        map.put("Сидоров", dateFormat.parse("JUNE 18 2018"));
        map.put("Джордан", dateFormat.parse("AUGUST 3 1993"));
        map.put("Джеймс", dateFormat.parse("SEPTEMBER 17 1990"));
        map.put("Бекхэм", dateFormat.parse("APRIL 25 1980"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map <String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()){
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args){
    }
}
