package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка - Medium

Перегрузи метод printMatrix() 8 различными способами, чтобы в итоге у тебя получилось 10 различных методов printMatrix().

Требования:
1. В классе Solution должны быть реализованы 10 методов printMatrix() с различными аргументами.
2. Класс Solution должен быть public.
3. Все методы класса Solution должны быть статическими.
4. Все методы класса Solution должны быть публичными.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix (int m, double n, String value){
            System.out.println("int m, double n, String value");
    }

    public static void printMatrix (double m, int n, String value){
        System.out.println("double m, int n, String value");
    }

    public static void printMatrix (double m, double n, String value){
        System.out.println("double m, double n, String value");
    }

    public static void printMatrix (short m, short n, String value){
        System.out.println("short m, short n, String value");
    }

    public static void printMatrix (short m, short n, Object value){
        System.out.println("short m, short n, Object value");
    }

    public static void printMatrix (long m, long n, String value){
        System.out.println("long m, long n, String value");
    }

    public static void printMatrix (int m, long n, String value){
        System.out.println("int m, long n, String value");
    }

    public static void printMatrix (byte m, long n, String value){
        System.out.println("byte m, long n, String value");
    }
}
