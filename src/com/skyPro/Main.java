package com.skyPro;

public class Main {
    public static void main(String[] args) {
        task1(6);
        task2(10);
        task3(60);
        task4(25);
        task5(17);
        task6(60, 102, 103);
        task7(2, 2, 2);

    }

    public static void task1(int age) {
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
    }

    public static void task2(int temperature) {

        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3(int speedometer) {
        if (speedometer > 60) {
            System.out.println("Скорость превышена!");
        } else {
            System.out.println("превышения скорости нет");
        }
    }

    public static void task4(int age) {

        if (age >= 2 && age <= 6)
            System.out.println("Eму нужно ходить в детский сад");

        else if (age >= 7 && age < 18)
            System.out.println("ему нужно ходить в школу");

        else if (age >= 18 && age <= 24)
            System.out.println("его место в университете");

        else if (age > 24)
            System.out.println("ему пора ходить на работу");
        else
            System.out.println("Человек еще слишком мал для детского садика");

    }

    public static void task5(int age) {

        if (age <= 5)
            System.out.println("Если возраст ребенка " + age + " он не может кататься на аттракционе");
        else if (age > 6 && age < 14)
            System.out.println("Если возраст ребенка " + age + " он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        else
            System.out.println("Если возраст ребенка " + age + " он может кататься без сопровождения взрослого");
    }

    public static void task6(int sittingPlace, int totalPlace, int counterPassenger) {

        if (counterPassenger <= sittingPlace && counterPassenger > 0) {
            System.out.println("Еще есть сидячих мест - " + (sittingPlace - counterPassenger));
        } else if (counterPassenger > sittingPlace && counterPassenger <= totalPlace) {
            System.out.println("Остались только стоячие места - " + (totalPlace - counterPassenger));
        } else {
            System.out.println("Вагон полностью забит");
        }
    }

    public static void task7(int one, int two, int three) {
        if (one > two && one > three)
            System.out.println("Самое большее число " + one);
        else if (two > one && two > three)
            System.out.println("Самое большее число " + two);
        else if (three > two && three > one)
            System.out.println("Самое большее число " + three);
        else
            System.out.println("Числа равны");
    }
}



