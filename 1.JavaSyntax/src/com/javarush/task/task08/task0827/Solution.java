package com.javarush.task.task08.task0827;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года -
нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
 */


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date currentDate = dateFormat.parse(date);

        Date yearStart = new Date();
        yearStart.setDate(0);
        yearStart.setMonth(0);

        int year = currentDate.getYear();

        yearStart.setYear(year);

        long msTimeDistance = currentDate.getTime() - yearStart.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int day = (int) (msTimeDistance/msDay);
        System.out.println(day);

        if (day%2 == 0){
            return true;
        } else{
            return false;
        }
    }
}
