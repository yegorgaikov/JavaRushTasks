package com.javarush.task.task02.task0201;

/* 
Реализуем метод print
*/
public class Solution {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java opens many opportunities!");
    }

    public static void print(String s) {
        int x=0;
        while (x<4){
            System.out.println (s);
            x=x+1;
        }
    }
}
