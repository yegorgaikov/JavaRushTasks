package com.javarush.task.task15.task1503;

/* 
ООП - машинки - Medium

Оцени наши машины и определи их в подходящую категорию — роскошное или дешевое авто — и выведи результат.
Для вывода используй только переменные из класса Constants.
1. В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
2. В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
3. Создай public static класс LuxuriousCar (РоскошнаяМашина).
4. Создай public static класс CheapCar (ДешеваяМашина).
5. Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для кого.
6. В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на
роскошной машине".
7. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой
машине".
8. В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными способами модификаторы
доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.

Требования:
1. Класс Solution должен содержать public static класс LuxuriousCar.
2. Класс Solution должен содержать public static класс CheapCar.
3. Класс Ferrari должен быть потомком класса LuxuriousCar.
4. Класс Lanos должен быть потомком класса CheapCar.
5. Метод printlnDesire в классе LuxuriousCar должен выводить на экран фразу "Я хочу ездить на роскошной
машине".
6. Метод printlnDesire в классе CheapCar должен выводить на экран фразу "Я хочу ездить на дешевой машине".
7. Метод printlnDesire в классе Ferrari должен выводить на экран фразу "Я хочу ездить на Феррари".
8. Метод printlnDesire в классе Lanos должен выводить на экран фразу "Я хочу ездить на Ланосе".
9. Область видимости методов printlnDesire в классах Ferrari и Lanos должна быть шире, чем в их классах
родителях.
*/

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {

            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class LuxuriousCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}
