package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных - Medium

Разберись, что и в какой последовательности инициализируется в этой программе, а затем:
1. Поставь брейкпойнты и используй дебаггер.
2. Исправь порядок инициализации данных так, чтобы результат был следующим:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name

Требования:
1. Программа должна выводить данные на экран.
2. Вывод на экран должен соответствовать условию задачи.
3. Результатом работы статического инициализатора класса Solution должен быть вывод на экран строк
"static void init()" и "Static block".
4. Программа не должна считывать данные с клавиатуры.
*/

public class Solution {

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
        System.out.println("Static block");
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }



    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}
