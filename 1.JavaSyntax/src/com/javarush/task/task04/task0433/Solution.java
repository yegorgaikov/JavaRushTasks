package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Требования:
1. Программа не должна считывать текст c клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна выводить квадрат из 10х10 букв S.
4. В программе должен использоваться цикл while.
*/

public class Solution {
    public static void main(String[] args) {
        String s = "S";
        int stroka = 1;


        while (stroka<11) {
            int stolbec = 1;
            while (stolbec<11){
                System.out.print(s);
                stolbec++;
            }
            System.out.println();
            stroka++;
        }

    }
}
