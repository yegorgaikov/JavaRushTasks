package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов - Medium

Чтобы решить эту задачу:
1. Создай 4 конструктора с разными модификаторами доступа в классе Solution.
2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
4. Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).

Требования:
1. В классе SubSolution должно содержаться 3 различных конструктора.
2. В классе Solution должно содержаться 4 различных конструктора.
3. В классе Solution должны быть объявлены конструкторы со всеми возможными модификаторами доступа.
4. В классе SubSolution должны быть объявлены конструкторы со всеми возможными модификаторами доступа, кроме private.
5. Класс Solution должен быть родителем класса SubSolution.
*/

public class Solution {
    private int a;
    private double b;
    private String s;

    public Solution() {
    }

    protected Solution(int a) {
    }

    private Solution(int a, double b) {
    }

    Solution(int a, double b, String s) {
    }

    public static void main(String[] args) {

    }
}