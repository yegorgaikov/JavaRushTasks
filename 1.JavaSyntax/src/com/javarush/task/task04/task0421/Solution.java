package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Требования:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        String s1 = new String(name1);
        String s2 = new String(name2);

        if (s1.equals(s2)) {
            System.out.println("Имена идентичны");
        }
        else if (s1.length() == s2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
