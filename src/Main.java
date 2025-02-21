public class Main {
    public static void main(String[] args) {
        byte byteNumber = 127;
        short shortNumber = 32767;
        int intNumber = 2147483647;
long longNumber = -9223372036854775808L;
float floatNumber = 3.1415926f;
double doubleNumber = 9.999999999999999;
        System.out.println("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом short равно "+ shortNumber);
        System.out.println("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно "+ floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно "+ doubleNumber);
float number = 27.12f;
long elseLong = 987678965549L;
float numberTwo = 2.786f;
short numberThree = 569;
short numberFour = -159;
short numberFive = 27897;
byte numberSix = 67;
short classLP = 23;
short classAS = 27;
short classEA = 30;
short boughtPaper = 480;
int everyStudentPaper = boughtPaper / (classEA+classAS+classLP);
System.out.println("На каждого ученика рассчитано " + everyStudentPaper + " листов бумаги");

byte performanceBottle = 16/2;

System.out.println("За 20 минут машина произвела " + performanceBottle*20 + " бутылок");
        System.out.println("За сутки машина произвела " + performanceBottle*60*24 + " бутылок");
        System.out.println("За три дня машина произвела " + performanceBottle*60*24*3 + " бутылок");
        System.out.println("За месяц машина произвела " + performanceBottle*60*24*30 + " бутылок");

  byte consumptionWhite = 2;
  byte consumptionBrown = 4;
  int consumptionFull = consumptionWhite + consumptionBrown;
  short boughtColor = 120;
  System.out.println("В школе, где " + boughtColor/consumptionFull +" классов, нужно  " +boughtColor/consumptionFull*consumptionWhite + " банок белой краски и " + boughtColor/consumptionFull*consumptionBrown + " банок коричневой краски");

  }
    }
