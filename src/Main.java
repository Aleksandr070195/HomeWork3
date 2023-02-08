public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int bananas = 100;
        System.out.println("Значение переменной bananas с типом целочисленные равно " + bananas);
        byte apples = 117;
        System.out.println("Значение переменной apples с типом целочисленные равно " + apples);
        short mango = 157;
        System.out.println("Значение переменной mango с типом целочисленные равно " + mango);
        long pears = 177;
        System.out.println("Значение переменной pears с типом целочисленные равно " + pears);
        float kiwi = 3.47f;
        System.out.println("Значение переменной kiwi с типом плавающей точкой равно " + kiwi);
        double tangerines = 2.77;
        System.out.println("Значение переменной tangerines с типом плавающей точкой равно " + tangerines);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        int k = 27897;
        System.out.println(k);
        byte j = 67;
        System.out.println(j);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte studentLudmila = 23;
        byte studentAnna = 27;
        byte studentEkaterina = 30;
        short paper = 480;
        int onePaperStudent = paper / (studentLudmila + studentAnna + studentEkaterina);
        System.out.println("На каждого ученика рассчитано " + onePaperStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte performanceTwoMinutes = 16;
        int performanceOneMinutes = performanceTwoMinutes / 2;
        System.out.println("За двадцать минут машина произвела " + performanceOneMinutes * 20 + " штук бутылок");
        int oneHourMinutes = performanceOneMinutes * 60;
        int ClockDay = 24;
        System.out.println("За сутки машина произвела " + oneHourMinutes * ClockDay + " штук бутылок");
        short performanceDay = 11520;
        int ThreeDays = 3;
        System.out.println("За три дня машина произвела " + performanceDay * ThreeDays + " штук бутылок");
        byte month = 31;
        System.out.println("За месяц машина произвела " + performanceDay * month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteJarClass = 2;
        byte brownJarClass = 4;
        int paintsOneClass = whiteJarClass + brownJarClass;
        int totalClasses = totalCans / paintsOneClass;
        System.out.println("В школе, где " + totalCans / paintsOneClass + " классов, нужно " + whiteJarClass * totalClasses + " банок белой краски и " + brownJarClass * totalClasses + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananaPiece = 5;
        byte oneBananaGram = 80;
        int fiveBananaGram = bananaPiece * oneBananaGram;
        short milkMl = 200;
        byte milk100Ml = 100;
        byte milk100MlGr = 105;
        int milkGr = (milkMl / milk100Ml) * milk100MlGr;
        byte iceCreamBriquettes = 2;
        byte oneIceCreamGr = 100;
        int iceCreamGR = iceCreamBriquettes * oneIceCreamGr;
        byte eggs = 4;
        byte oneEggsGr = 70;
        int eggsGr = eggs * oneEggsGr;
        int weightGr = fiveBananaGram + milkGr + iceCreamGR + eggsGr;
        int grPerKg = 1000;
        float weightKg = weightGr / (float) grPerKg;
        System.out.println(weightKg);
    }

    public static void task7() {
        System.out.println("Задача 7");
        short oneKgGr = 1000;
        byte totalKG = 7;
        int totalGr = oneKgGr * totalKG;
        short resetGrDayA = 250;
        int day250Gr = totalGr / resetGrDayA;
        System.out.println(day250Gr);
        short resetGrDayB = 500;
        int day500Gr = totalGr / resetGrDayB;
        System.out.println(day500Gr);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int workerMasha = 67760;
        int workerDenis = 83690;
        int workerKristina = 76230;
        byte year = 12;
        int salaryM = workerMasha * 10 / 100;
        System.out.println("Маша теперь получает " + (workerMasha + salaryM) + " рублей. Годовой доход вырос на " + year * salaryM + " рублей");
        int salaryD = workerDenis * 10 / 100;
        System.out.println("Денис теперь получает " + (workerDenis + salaryD) + " рублей. Годовой доход вырос на " + year * salaryD + " рублей");
        int salaryK = workerKristina * 10 / 100;
        System.out.println("Кристина теперь получает " + (workerKristina + salaryK) + " рублей. Годовой доход вырос на " + year * salaryK + " рублей");

    }
}
