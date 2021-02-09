package com.javarush.task.task12.task1217;

/* 
Лететь, бежать и плыть - Easy

Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавить в каждый интерфейс по одному методу.

Требования:
1. Класс Solution должен содержать интерфейс CanFly.
2. Класс Solution должен содержать интерфейс CanRun.
3. Класс Solution должен содержать интерфейс CanSwim.
4. Интерфейс CanFly должен содержать один метод.
5. Интерфейс CanRun должен содержать один метод.
6. Интерфейс CanSwim должен содержать один метод.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly{
        void fly();
    }

    public interface CanRun {
        void run();
    }
    public interface CanSwim {
        void swim ();
    }

}
