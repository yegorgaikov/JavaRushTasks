package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать,
трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList <Human> dad = new ArrayList<>();
        ArrayList <Human> mom = new ArrayList<>();
        ArrayList <Human> child = new ArrayList<>();

        Human child1 = new Human("Роман", true, 25, null);
        Human child2 = new Human ("Егор", true, 23, null);
        Human child3 = new Human ("Мария", false , 20, null);

        child.add(child1);
        child.add(child2);
        child.add(child3);

        Human father = new Human ("Александр", true, 50, child);
        Human mother = new Human("Татьяна", false, 48, child);

        dad.add(father);
        mom.add(mother);

        Human grandfatherDad = new Human("Анатолий", true, 75, dad);
        Human grandmotherDad = new Human("Надежда", false, 72, dad);
        Human grandfatherMom = new Human("Сергей", true, 76, mom);
        Human grandmotherMom = new Human("Елена", false, 74, mom);

        System.out.println(grandfatherDad);
        System.out.println(grandmotherDad);
        System.out.println(grandfatherMom);
        System.out.println(grandmotherMom);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if(this.children != null){
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }

            return text;
        }
    }
}
