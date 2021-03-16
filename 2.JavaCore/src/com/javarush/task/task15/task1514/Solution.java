package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1 - Easy

В статическом блоке инициализируй labels пятью различными парами ключ-значение.

Требования:
1. В классе Solution должен быть только один метод — main().
2. В классе Solution должно быть объявлено статическое поле labels типа Map.
3. Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
4. Метод main должен выводить содержимое labels на экран.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(23.5, "privet");
        labels.put(3.14, "kak dela?");
        labels.put(35.7, "horosho");
        labels.put(45.8, "moi toje");
        labels.put(125.0, "poka");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
