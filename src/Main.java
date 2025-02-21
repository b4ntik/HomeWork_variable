public class Main {
    public static void main(String[] args) {
        System.out.println("задание №1");
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
        //задание №2
        System.out.println("задание №2");
float number = 27.12f;
long elseLong = 987678965549L;
float numberTwo = 2.786f;
short numberThree = 569;
short numberFour = -159;
short numberFive = 27897;
byte numberSix = 67;
//задание №3
        System.out.println("задание №3");
short classLP = 23; // класс Людмилы Павловны
short classAS = 27; //класс Анны Сергеевны
short classEA = 30; //класс Екатерины Андреевны
short boughtPaper = 480; //закупленная бумага
int everyStudentPaper = boughtPaper / (classEA+classAS+classLP); //расход бумаги на ученика
System.out.println("На каждого ученика рассчитано " + everyStudentPaper + " листов бумаги");
//задание №4
        System.out.println("задание №4");
byte performanceBottle = 16/2; //производительность станка в минуту

System.out.println("За 20 минут машина произвела " + performanceBottle*20 + " бутылок");
        System.out.println("За сутки машина произвела " + performanceBottle*60*24 + " бутылок");
        System.out.println("За три дня машина произвела " + performanceBottle*60*24*3 + " бутылок");
        System.out.println("За месяц машина произвела " + performanceBottle*60*24*30 + " бутылок");
//задание №5
        System.out.println("задание №5");
  byte consumptionWhite = 2; //расход белой краски
  byte consumptionBrown = 4; //расход коричневой краски
  int consumptionFull = consumptionWhite + consumptionBrown; //расход краски на класс
  short boughtColor = 120; //закупленная краска
  System.out.println("В школе, где " + boughtColor/consumptionFull +" классов, нужно  " + boughtColor/consumptionFull*consumptionWhite + " банок белой краски и " + boughtColor/consumptionFull*consumptionBrown + " банок коричневой краски");
  // задание №6
        System.out.println("задание №6");
   byte bananaWeight = 80; //вес банана
   byte milkWeight = 105;//вес молока
   byte iceCreamWeight = 100;//вес мороженого
   byte eggWeight = 70;//вес яйца
        int breakFast = 5*bananaWeight + 2*milkWeight + 2*iceCreamWeight + 4*eggWeight;
       float breakFastKg = breakFast/1000f; //корректно переводим в килограммы
        System.out.println("На завтрак спортсмен съедает " + breakFast + " граммов (или " + breakFastKg +" килограммов) еды");
// задание №7
        System.out.println("задание №7");
  }
    }
