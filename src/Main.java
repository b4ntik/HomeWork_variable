import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // задание №1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний");
        }
        //задание №2
        int streetTemperature;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите температуру воздуха на улице"); // вводим уличную температуру
        streetTemperature = in.nextInt();
        if (streetTemperature > 5){
            System.out.println("На улице "+streetTemperature+ " градусов, можно идти без шапки");
        } else
        {
            System.out.println("На улице "+streetTemperature+ " градусов, нужно надеть шапку");
        }
        //задание №3
        System.out.print("Введите скорость ");
        int speed = in.nextInt();
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
}

