package ru.netology.javaqa;

public class montsOfRestServic {
    public int calculate(int threshold, int income, int expense) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expense) / 3;
            } else {
                money = money + income - expense;
            }
        }
        return count;
    }
}
