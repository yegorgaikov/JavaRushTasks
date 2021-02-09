package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a>b){
            if (b>c){
                System.out.println(a + " " + b + " " + c);
            }
            else if (a>c) {
                System.out.println(a + " " + c + " " + b);
            }
            else {
                System.out.println(c + " " + a + " " + b);
            }
        }
        else {
            if (b<c){
                System.out.println(c + " " + b + " " + a);
            }
            else if (a>c) {
                System.out.println(b + " " + a + " " + c);
            }
            else {
                System.out.println(b + " " + c + " " + a);
            }
        }

    }
}
