package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);

        if (a==b){
            if (a==b & b==c){
                System.out.println(a + " " + b + " " + c);
            }
            else
                System.out.print(a + " " + b);
        }
        else if (a==c){
            if (a==b & b==c){
                System.out.println(a + " " + b + " " + c);
            }
            else
                System.out.print(a + " " + c);
        }
        else if (b==c){
            if (a==b & b==c){
                System.out.println(a + " " + b + " " + c);
            }
            else
                System.out.print(b + " " + c);
        }

    }
}