package com.javarush.task.task02.task0216;

/* 
Минимум трёх чисел
*/
public class Solution {
    public static int min(int a, int b, int c) {
        int minChislo;
        if (a<=b && a<=c) {
            minChislo = a;
        }
        else if (b<=a && b<=c) {
            minChislo = b;
        }
        else {
            minChislo = c;
        }
        return minChislo;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}