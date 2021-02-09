package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2,
потом последний.

Требования:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет
главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <Integer> mainList = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            int a = Integer.parseInt(reader.readLine());
            mainList.add(a);
        }

        ArrayList <Integer> list1 = new ArrayList<>(); // число нацело делится на 3
        ArrayList <Integer> list2 = new ArrayList<>(); // число нацело делится на 2
        ArrayList <Integer> list3 = new ArrayList<>(); // остальные

        for (int i = 0; i < mainList.size(); i++){
            int x = mainList.get(i);
            if (x % 3 == 0 && x % 2 == 0){
                list1.add(x);
                list2.add(x);
            }
            else if (x % 3 == 0)
                list1.add(x);
            else if (x % 2 == 0)
                list2.add(x);
            else
                list3.add(x);
        }

        printList(list1);
        printList(list2);
        printList(list3);

    }


    public static void printList(ArrayList<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}

/*
5
10
16
17
9
3
4
46
97
89
12
45
98
111
42
99
98
9
71
150
 */