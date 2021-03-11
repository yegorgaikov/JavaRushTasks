package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - Moldova. Я несу 25 яиц в месяц.";
    }
}