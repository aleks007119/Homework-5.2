public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание №1");
        System.out.println("Задание №1");

        int savings = 105_000;
        int total = 0;
        int i = 0;

        while (total < 2_459_000) {
            i ++;
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
        System.out.println("Задание 2");

        int j = 0;

        while (j < 10) {
            j ++;
            System.out.print(j + " ");
        }
        System.out.println();

        for (j = 10; j >= 1; j --) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Задание 3");

        int population = 12_000_000;
        double death = (double) 8 / 1000;
        double birth = (double) 17 / 1000;

        while (j < 10) {
            population = (int) (population + (population * birth) - (population * death));
            j ++;
            System.out.println("Год " + j + ", численность населения составляет " + population);
        }

        System.out.println("Домашнее задание №2");
        System.out.println("Задание 1, 2");

        /*double bankInterest = 0.07;
        int firstInstallment = 15000;
        int sum = 0;
        int percentageAmount = 0;
        int k = 0;

        while (sum < 12_000_000) {
            k ++;
            percentageAmount = (int) (firstInstallment * bankInterest);
            firstInstallment = firstInstallment + percentageAmount;
            sum = (int) (firstInstallment + (percentageAmount * bankInterest));
            if (k % 6 == 0) {
                System.out.println("Месяц " + k + " накоплено " + sum);
            }
        }*/
        System.out.println("Задание 3");

        double bankInterest = 0.07;
        int firstInstallment = 15000;
        int sum = 0;
        int percentageAmount = 0;
        int k = 0;

        while (sum < 12_000_000) {
            k ++;
            percentageAmount = (int) (firstInstallment * bankInterest);
            firstInstallment = firstInstallment + percentageAmount;
            sum = (int) (firstInstallment + (percentageAmount * bankInterest));
            if (k % 6 == 0 && k <=120) {
                System.out.println("Месяц " + k + " накоплено " + sum);
            }
        }

        System.out.println("Задание 4");

        int friday = 3;
        int month = 31;
        int day = 0;

        while (day <= month) {
            day ++;
            if (day % 7 == 3) {
                System.out.println("Сегодня пятница " + day + "- е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println("Домашнее задание №3");
        System.out.println("Задание 1");

        int cometFlight = 79;
        int yearZero = 0;
        int yearNow = 2022;

        int yearEarlier = 1896;
        int yearLater = 2122;

        while (yearZero <= yearNow) {
            for (yearZero = 0; yearZero <= yearNow; yearZero += cometFlight){
                System.out.println("Комета пролетала в " + yearZero + " годах.");
            }
            for (yearEarlier = 1896; yearEarlier < yearLater; yearEarlier += cometFlight) {
                System.out.println(yearEarlier);
            }
        }

        System.out.println("Задание 2");

        int t = 0;
        while (t < 10){
            t ++;
            sum = t * 2;
            System.out.println("2*" + t + "=" + sum);
        }

    }
}