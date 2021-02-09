package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human - Medium

Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private boolean education;
        private double avGrade;
        private boolean partner;

        public Human(String name, int age, boolean sex, boolean education, double avGrade, boolean partner){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.education = education;
            this.avGrade = avGrade;
            this.partner = partner;
        }

        public Human(String name, int age, boolean sex, boolean education, double avGrade){
            this (name, age, sex, education, avGrade, false);
        }
        public Human(String name, int age, boolean sex, boolean education){
            this (name, age, sex, education, 0.0, false);
        }
        public Human(String name, int age, boolean sex){
            this (name, age, sex, false, 0.0, false);
        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, boolean sex, boolean partner){
            this (name, 0, sex, false, 0.0, partner);
        }
        public Human(int age, boolean sex, boolean education){
            this (null, age, sex, education, 0.0, false);
        }
        public Human(boolean education){
            this.education = education;
        }
    }
}
