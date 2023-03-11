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
    private static void task1() {
        int apple = 25000230;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        byte pear = 100;
        System.out.println("Значение переменной pear с типом byte равно " + pear);
        short plum = 28352;
        System.out.println("Значение переменной plum с типом short равно " + plum);
        long grape = 900677856L;
        System.out.println("Значение переменной grape с типом long равно " + grape);
        float planetSize = 3.45f;
        System.out.println("Значение переменной planetSize с типом float равно " + planetSize);
        double calculationAccuracy = 0.0075_6;
        System.out.println("Значение переменной calculationAccuracy с типом double равно " + calculationAccuracy);
    }
    private static void task2() {
        double a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte h = 67;
        System.out.println(h);
    }
    private static void task3() {
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short purchasedPaper = 480;
        int eachSheets = purchasedPaper / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + eachSheets + " листов бумаги");
    }
    private static void task4() {
        byte makesBottles1Minutes = 16 / 2;
        byte aMinutes = 20;
        short bMinutes = 24 * 60;
        short cMinutes = 3 * 24 * 60;
        int dMinutes = 30 * 24 * 60;
        int makesBottles = makesBottles1Minutes * aMinutes;
        System.out.println("За 20 минут машина произвела " + makesBottles + " штук бутылок");
        int makesBottles1 = makesBottles1Minutes * bMinutes;
        System.out.println("За сутки машина произвела " + makesBottles1 + " штук бутылок");
        int makesBottles2 = makesBottles1Minutes * cMinutes;
        System.out.println("За 3 дня машина произвела " + makesBottles2 + " штук бутылок");
        int makesBottles3 = makesBottles1Minutes * dMinutes;
        System.out.println("За 1 месяц машина произвела " + makesBottles3 + " штук бутылок");
    }
    private static void task5() {
        byte totalPaint  = 120;
        byte paint1ClassWhite = 2;
        byte paint1ClassBrown = 4;
        int numberClasses = totalPaint / (paint1ClassBrown + paint1ClassWhite);
        int totalWhite = numberClasses * paint1ClassWhite;
        int totalBrown = numberClasses * paint1ClassBrown;
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown+ " банок коричневой краски");
    }
    private static void task6() {
        byte bananasQuantity = 5;
        byte milk100Quantity = 2;
        byte iceCreamQuantity = 2;
        byte rawEggsQuantity = 4;

        short bananasWeight = 80;
        short milk100Weight = 105;
        short iceCreamWeight = 100;
        short rawEggsWeight = 70;

        int sportBreakfastG = bananasQuantity * bananasWeight + milk100Quantity * milk100Weight + iceCreamQuantity * iceCreamWeight + rawEggsQuantity * rawEggsWeight;
        System.out.println("Вес спортивного завтрака " + sportBreakfastG + " грамм.");
        float sportBreakfastKg = (float) sportBreakfastG / 1000;
        System.out.println("Вес спортивного завтрака " + sportBreakfastKg + " кг.");
    }
    private static void task7() {
        short desiredWeight = 7 * 1000;
        short method1 = 250;
        short method2 = 500;
        short method3 = (250 + 500) / 2;
        int amountDaysMethod1 = desiredWeight / method1;
        System.out.println("Потребуеться " + amountDaysMethod1 + " дней, если худеть по " + method1 + " грамм в день.");
        int amountDaysMethod2 = desiredWeight / method2;
        System.out.println("Потребуеться " + amountDaysMethod2 + " дней, если худеть по " + method2 + " грамм в день.");
        int amountDaysMethod3 = desiredWeight / method3;
        System.out.println("Потребуеться " + amountDaysMethod3 + " дней, если худеть по " + method3 + " грамм в среднем , в день.");
    }
    private static void task8() {
        int masha1Month = 67760;
        int denis1Month = 83760;
        int kristina1Month = 76230;
        float salaryIncreaseYear = (float) 1.1;

        int salaryYearMasha = masha1Month * 12;
        int salaryYearDenis = denis1Month * 12;
        int salaryYearKristina = kristina1Month * 12;

        float mashaSalaryNew1Mans = masha1Month * salaryIncreaseYear;
        float denisSalaryNew1Mans = denis1Month * salaryIncreaseYear;
        float kristinaSalaryNew1Mans = kristina1Month * salaryIncreaseYear;

        float salaryNewYearMasha = salaryYearMasha * salaryIncreaseYear;
        float salaryNewYearDenis = salaryYearDenis * salaryIncreaseYear;
        float salaryNewYearKristina = salaryYearKristina * salaryIncreaseYear;

        float salaryDifferenceMasha = salaryNewYearMasha - salaryYearMasha;
        float salaryDifferenceDenis = salaryNewYearDenis - salaryYearDenis;
        float salaryDifferenceKristina = salaryNewYearKristina - salaryYearKristina;
        System.out.println("Маша теперь получает " + mashaSalaryNew1Mans + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryNew1Mans + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryNew1Mans + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей");
    }
}