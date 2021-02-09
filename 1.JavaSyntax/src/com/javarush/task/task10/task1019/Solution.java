package com.javarush.task.task10.task1019;

/* 
Функциональности маловато! - Hard*

Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. В методе main объяви переменную коллекции HashMap и сразу проинициализируй ee.
4. Программа должна помещать в HashMap пары считанные с клавиатуры.
5. Программа должна выводить на экран содержимое HashMap согласно условию. Ключ и значение разделены пробелом.
Каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap <String, Integer> map = new HashMap<>();

        while(true){
            String s = reader.readLine();
            if(s.isEmpty()){
                break;
            }

            int x = Integer.parseInt(s);
            String name = reader.readLine();

            map.put(name, x);

        }

        for (Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}


/*
1
Строка1
2
Строка2
3
Строка3
4
Строка4
4
Строка5
7
Строка6
7
Строка7
8
Строка8
9
Строка9
10
Строка10

 */