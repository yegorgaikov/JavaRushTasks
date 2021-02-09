package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке - Medium

Ввести с клавиатуры в список 20 слов.
Нужно подсчитать сколько раз каждое слово встречается в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово,
а второй - число, сколько раз данное слово встречалось в списке.

Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.

Требования:
1. Метод countWords должен объявлять и инициализировать HashMap с типом элементов <String, Integer>.
2. Метод countWords должен возвращать созданный словарь.
3. Метод countWords должен добавлять в словарь ключи, соответствующие уникальным словам, и значения по этим ключам,
отображающие сколько раз встречалось слово.
4. Программа должна выводить на экран полученный словарь.
5. Метод main должен вызывать метод countWords.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> map = new HashMap <>();

        for (String s : list){
            int count = 0;
            for (int i = 0; i < list.size(); i++){
                if(s.equals(list.get(i))){
                    count++;
                }
            }

            map.put(s,count);
        }

        return map;
    }

}



/*
Машина
Перерыв
Скакун
Телефон
Игра
пророк
Яблоко
платок
дерево
уксус
уксус
Игра
пророк
Яблоко
пророк
Яблоко
Яблоко
шишка
шайба
пикник
 */