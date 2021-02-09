package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк - Medium

Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.

Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayLists = new ArrayList[3];

        ArrayList <String> arrayList1 = new ArrayList<>(1);

        arrayList1.add("строка1");

        ArrayList <String> arrayList2 = new ArrayList<>(2);

        arrayList2.add("строка1");
        arrayList2.add("строка2");

        ArrayList <String> arrayList3 = new ArrayList<>(3);

        arrayList3.add("строка1");
        arrayList3.add("строка2");
        arrayList3.add("строка3");

        arrayLists[0] = arrayList1;
        arrayLists[1] = arrayList2;
        arrayLists[2] = arrayList3;

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
