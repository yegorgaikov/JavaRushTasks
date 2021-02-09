package com.javarush.task.task13.task1310;

/* 
Будущий управленец - Easy

1. Добавь интерфейсы Secretary и Boss к классам Manager и Subordinate. По одному на каждый. Подумай, кому какой.
2. Унаследуй интерфейсы Secretary и Boss от интерфейсов Person и HasManagementPotential так,
чтобы все методы у классов Manager и Subordinate оказались объявленными в каком-то интерфейсе.

Требования:
1. Класс Manager должен реализовывать подходящий ему интерфейс(Secretary или Boss).
2. Класс Subordinate должен реализовывать подходящий ему интерфейс(Secretary или Boss).
3. Секретарь(Secretary) является человеком(Person).
4. Начальник(Boss) является человеком(Person), который может заставить других усердно работать(HasManagementPotential).
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface HasManagementPotential extends Person {
        boolean inspiresOthersToWork();
    }

    interface Secretary extends Person {
    }

    interface Boss extends HasManagementPotential, Person {
    }

    class Manager implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean inspiresOthersToWork() {
            return true;
        }
    }

    class Subordinate implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }
    }
}
