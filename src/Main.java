public class Main {
    public static void main(String[] args) {
        // Домашнее задание - 1.

        // Задание - 1.
        System.out.println("Задание - 1.");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // Задание - 2.
        System.out.println("Задание - 2.");

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }

        // Задание - 3.
        System.out.println("Задание - 3.");
        for (int i = 0 + 2; i < 17; i = i + 2){
            System.out.println(i);
        }

        // Задание - 4.
        System.out.println("Задание - 4.");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }




        // Домашнее задание - 2.

        // Задание - 1.
        System.out.println("Задание - 1.");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задание - 2.
        System.out.println("Задание - 2.");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание - 3.
        System.out.println("Задание - 3.");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.print(i + " ");
        }
        System.out.println();




        // Домашнее задание - 3.

        // Задание - 1.
        System.out.println("Задание - 1.");
        int  moneyPerMonth = 29000;
        int accumulation = 0;
        for (int i = 1; i <= 12; i++){
            accumulation = accumulation + moneyPerMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation + " рублей");
        }

        // Задание - 2.
        System.out.println("Задание - 2.");
        int  moneyPerMonth1 = 29000;
        int accumulation1 = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation1 = accumulation1 + accumulation1/100;
            accumulation1 = accumulation1 + moneyPerMonth1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation1 + " рублей");
        }
    }
}