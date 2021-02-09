package com.javarush.task.task04.task0414;

/* 
Количество дней в году
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int year = Integer.parseInt(s);
        int x=365;

        if (year%400 == 0){
            System.out.println("количество дней в году: " + ++x);
        }
        else if (year%100 == 0) {
            System.out.println("количество дней в году: " + x);
        }
        else if (year%4 == 0) {
            System.out.println("количество дней в году: " + ++x);
        }
        else {
            System.out.println("количество дней в году: " + x);
        }

    }
}