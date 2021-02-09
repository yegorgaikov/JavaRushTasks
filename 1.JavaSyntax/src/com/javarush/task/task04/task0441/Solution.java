package com.javarush.task.task04.task0441;

/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((b<a && a<c) || (c<a && a<b) || (a==b && b<c) || (a==b && b>c) || (a==c && c<b) || (a==c && c>b) || (a==b && b==c)) {
            System.out.println(a);
        }
        else if ((a<b && b<c) || (c<b && b<a) || (b==c && c<a) || (b==c && c<a)) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }


    }
}



/*  if (a>b) {
            if (b>c || b==c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
        else if (b>a){
            if (a>c || a==c){
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else if (c>a){
            if (a>b || a==b) {
                System.out.println(b);
            }
            else {
                System.out.println(a);
            }
        }
        else {
            System.out.println(a);
        }
*/