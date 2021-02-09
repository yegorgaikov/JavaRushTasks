package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String name = reader.readLine();
        String a1 = reader.readLine();
        int a2 = Integer.parseInt(a1);
        String b1 = reader.readLine();
        int b2 = Integer.parseInt(b1);
        System.out.println(name + " получает " + a2 + " через " + b2 + " лет.");

    }
}
