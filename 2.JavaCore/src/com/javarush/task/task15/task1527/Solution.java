package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов - Hard

Для решения этой задачи тебе нужно:
1. Считать с консоли URL-ссылку.
2. Вывести на экран список всех параметров через пробел (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
3. Если присутствует параметр obj, то передать его значение в нужный метод alert():
alert(double value) - для чисел (дробные числа разделяются точкой);
alert(String value) - для строк.
Обрати внимание на то, что метод alert() необходимо вызывать после вывода списка всех параметров на экран.

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double: 3.14

Требования:
1. Программа должна считывать с клавиатуры только одну строку.
2. Класс Solution не должен содержать статические поля.
3. Программа должна выводить данные на экран в соответствии с условием.
4. Программа должна вызывать метод alert() с параметром double, если значение параметра obj можно корректно
преобразовать в число типа double.
5. Программа должна вызывать метод alert() с параметром String, если значение параметра obj нельзя корректно
преобразовать в число типа double.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        int indexOfStartParameters = url.indexOf("?") + 1;
        String urlParameters = url.substring(indexOfStartParameters);
        String[] parameters = urlParameters.split("&");
        StringBuilder nameParameters = new StringBuilder();
        ArrayList<String> listWithValueObj = new ArrayList<>();

        for (int i = 0; i < parameters.length; i++) {
            String parameter = parameters[i];
            String[] splitParameter = parameter.split("=");
            nameParameters.append(splitParameter[0]).append(" ");
            if (splitParameter[0].equals("obj")) {
                listWithValueObj.add(splitParameter[1]);
            }
        }
        System.out.println(nameParameters.toString().trim());


        for (String valueObj : listWithValueObj) {
            try {
                alert(Double.parseDouble(valueObj));
            } catch (Exception e) {
                alert(valueObj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}