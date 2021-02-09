package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):реализовать механизм драки котов в зависимости от их веса, возраста и силы.

Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.

Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.

Требования:
1. Класс Cat должен содержать конструктор без параметров. OK
2. Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные. OK
3. В классе Cat должен быть метод fight. OK
4. В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
5. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом. ATTENTION
6. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {  //в параметр объект входит
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;

    }

    public static void main(String[] args) {

    }
}
