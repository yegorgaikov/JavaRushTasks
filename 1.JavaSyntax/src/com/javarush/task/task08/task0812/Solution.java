package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<10 ; i++){
            int x = Integer.parseInt(reader.readLine());
            arrayList.add(x);
        }

        int count = 1;
        int countResult = 1;

        for (int i = 0, j = 1; j < arrayList.size(); i++, j++){
            if(arrayList.get(i).equals(arrayList.get(j))){
                count++;
                if (count >= countResult){
                    countResult = count;
                }
            }
            else {
                count = 1;
            }
        }

        System.out.println(countResult);
    }
}




/*
128
128
128
128
55
128
128
128
128
128
 */