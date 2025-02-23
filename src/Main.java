import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // задание №1
        // добавляеем чуть-чуть интерактива
        Scanner in = new Scanner(System.in);//ввод числа из консоли
        System.out.println("Введите возраст человека"); // вводим возраст
        int age = in.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний");
        }
        //задание №2
        int streetTemperature;//вводим уличную температуру
        System.out.println("Введите температуру воздуха на улице"); // вводим уличную температуру
        streetTemperature = in.nextInt();
        if (streetTemperature > 5) {
            System.out.println("На улице " + streetTemperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + streetTemperature + " градусов, нужно надеть шапку");
        }
        //задание №3
        System.out.println("Введите скорость ");//ввод скорости
        int speed = in.nextInt();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //задание №4
        System.out.println("Введите возраст ");
        int humanAge = in.nextInt();
        if (humanAge > 2 && humanAge <= 6) {
            System.out.println("Если возраст равен " + humanAge + " то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст равен " + humanAge + " то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст равен " + humanAge + " то его место в университете");
        } else if (humanAge > 24) {
            System.out.println("Если возраст равен " + humanAge + " то ему нужно ходить на работу");
        }
        //задание №5
        System.out.println("Введите возраст ребенка");
        int childAge = in.nextInt();
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childAge > 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //задание №6
        System.out.println("Введите количество пассажиров");
        int passengerCount = in.nextInt();
        if (passengerCount > 1 && passengerCount <= 60) {
            System.out.println("Для такого количества паасжиров еще остались сидяиче места");
        } else if (passengerCount > 60 && passengerCount <= 102) {
            System.out.println("Такое количество пассажиров влезет, но часть будет стоять");
        } else if (passengerCount < 0 || passengerCount > 102) {
            System.out.println("Для такого количества людей мест нет");
        }
        //задание №7
        Scanner inTwo = new Scanner(System.in);//добавляем количество вводимых переменных
        Scanner inThree = new Scanner(System.in);
        System.out.println("Введите первое число");
        int one = in.nextInt();
        System.out.println("Введите второе число");
        int two = inTwo.nextInt();
        System.out.println("Введите третье число");
        int three = inThree.nextInt();
        if (one > two && one > three) {
            System.out.println("Максимальное из введенных чисел - первое. Это  " + one);
        } else if (two > one && two > three) {
            System.out.println("Максимальное из введенных чисел - второе. Это  " + two);
        } else if (three > two && three > one) {
            System.out.println("Максимальное из введенных чисел - третье. Это " + three);
        }
    }
}




