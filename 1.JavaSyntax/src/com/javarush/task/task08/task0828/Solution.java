package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца

Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        Map <Integer, String> monthMap = new HashMap<>();

        monthMap.put(1 , "January");
        monthMap.put(2 , "February");
        monthMap.put(3 , "March");
        monthMap.put(4 , "April");
        monthMap.put(5 , "May");
        monthMap.put(6 , "June");
        monthMap.put(7 , "July");
        monthMap.put(8 , "August");
        monthMap.put(9 , "September");
        monthMap.put(10 , "October");
        monthMap.put(11 , "November");
        monthMap.put(12 , "December");

        for(Map.Entry<Integer, String > pair : monthMap.entrySet()){
            if (pair.getValue().equals(month)){
                System.out.println(pair.getValue() + " is the " + pair.getKey() + " month");
                break;
            }
        }
    }
}

/*
April
 */