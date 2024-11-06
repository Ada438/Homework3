//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte varByte = 67;
        short varShort = 569;
        short varShort2 = -159;
        int varInt = 27897;
        long varLong = 987678965549L;
        float varFloat = 3.1f;
        double varDouble = 2.786;

        byte ludmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        int paper = 480;
        int total = paper/(ludmilaP+annaS+ekaterinaA);
        System.out.println ("На каждого ученика рассчитано " + total + " листов бумаги");

        byte perf2min = 16;
        int perf1min = perf2min/2;
        byte time1 = 20;
        int perf20min = perf1min*time1;
        int time2 = 60*24;
        int perf1day = perf1min*time2;
        int perf3days = perf1day*3;
        int perf1month = perf1day*30;
        System.out.println ("За 20 минут машина произвела " + perf20min + " штук бутылок");
        System.out.println ("За сутки машина произвела " + perf1day + " штук бутылок");
        System.out.println ("За 3 дня машина произвела " + perf3days + " штук бутылок");
        System.out.println ("За месяц машина произвела " + perf1month + " штук бутылок");

        byte whitePerRoom = 2;
        byte brownPerRoom = 4;
        byte totalPaint = 120;
        int totalRooms = totalPaint/(whitePerRoom+brownPerRoom);
        int whiteTotal = totalRooms*whitePerRoom;
        int brownTotal = totalRooms*brownPerRoom;
        System.out.println ("В школе, где " + totalRooms + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");

byte banana = 5;
int bananaW = 80;
int bananaWTotal = banana*bananaW;
int milkMl = 200;
int milk100MlInGr = 105;
int milkWeightInGr = 105*(milkMl/100);
byte iceCream = 2;
int iceCreamWeight = 100;
int iceCreamWTotal = iceCream*iceCreamWeight;
byte eggs = 4;
byte eggsWeight = 70;
int eggsWTotal = eggs*eggsWeight;
float totalWeightGr = eggsWTotal+iceCreamWTotal+milkWeightInGr+bananaWTotal;
float totalWeightKg = totalWeightGr/1000;
        System.out.println ("Результат: в граммах = " + totalWeightGr + ", в килограммах = " + totalWeightKg);

int loss1 = 250;
int loss2 = 500;
int totalLossKg = 7;
int totalLossGr = totalLossKg*1000;
int days1 = totalLossGr/loss1;
int days2 = totalLossGr/loss2;
int aver = (days1+days2)/2;
        System.out.println ("При потере веса " + loss1 + " г в день, потребуется " + days1 + " дней, а при потере веса " + loss2 + "г в день, потребуется " + days2 + " дней. В среднем потребуется " + aver + " дней.");

        int salaryM = 67760;
        int salaryDenis = 83690;
        int salaryK = 76230;
        double salaryMNew = salaryM*1.1;
        double salaryDenisNew = salaryDenis*1.1;
        double salaryKNew = salaryK*1.1;
        double diffM = (salaryMNew*12) - (salaryM*12);
        double diffD = (salaryDenisNew*12) - (salaryDenis*12);
        double diffK = (salaryKNew*12) - (salaryK*12);
        System.out.println("Маша теперь получает " + salaryMNew + " рублей. Годовой доход вырос на " + diffM + " рублей. Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + diffD + " рублей. Кристина теперь получает " + salaryKNew + " рублей. Годовой доход вырос на " + diffK + " рублей.");

    }
}