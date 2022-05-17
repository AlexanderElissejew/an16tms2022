
////4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
//
//

import java.util.Scanner;

public class HomeWork1Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wwedite denj rozdenia: ");
        int d = scan.nextInt();
        System.out.println("Wwedite mesjac rozdenia: ");
        int m = scan.nextInt();
        if (m < 13 && m > 0) {
            switch (m) {
                case 1:
                    if (d < 21 && d > 0) {
                        System.out.println("Kozerog");
                    } else if (d > 20 && d < 32) {
                        System.out.println("Wodolej");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 2:
                    if (d < 20 && d > 0) {
                        System.out.println("Wodolej");
                    } else if (d > 20 && d < 32) {
                        System.out.println("Ribi");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 3:
                    if (d < 21 && d > 0) {
                        System.out.println("Ribi");
                    } else if (d > 20 && d < 32) {
                        System.out.println("Owen");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 4:
                    if (d < 21 && d > 0) {
                        System.out.println("Owen");
                    } else if (d > 20 && d < 32) {
                        System.out.println("Telec");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 5:
                    if (d < 22 && d > 0) {
                        System.out.println("Telec");
                    } else if (d > 21 && d < 32) {
                        System.out.println("Blizneci");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 6:
                    if (d < 22 && d > 0) {
                        System.out.println("Blizneci");
                    } else if (d > 21 && d < 32) {
                        System.out.println("Rak");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 7:
                    if (d < 23 && d > 0) {
                        System.out.println("Rak");
                    } else if (d > 22 && d < 32) {
                        System.out.println("Lew");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 8:
                    if (d < 24 && d > 0) {
                        System.out.println("Lew");
                    } else if (d > 23 && d < 32) {
                        System.out.println("Dewa");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 9:
                    if (d < 24 && d > 0) {
                        System.out.println("Dewa");
                    } else if (d > 23 && d < 32) {
                        System.out.println("Wesi");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 10:
                    if (d < 24 && d > 0) {
                        System.out.println("Wesi");
                    } else if (d > 23 && d < 32) {
                        System.out.println("Scorpion");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 11:
                    if (d < 23 && d > 0) {
                        System.out.println("Scorpion");
                    } else if (d > 23 && d < 32) {
                        System.out.println("Strelec");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
                case 12:
                    if (d < 23 && d > 0) {
                        System.out.println("Strelec");
                    } else if (d > 22 && d < 32) {
                        System.out.println("Kozerog");
                    } else {
                        System.out.println("Wi wweli newrniy denj");
                    }
                    break;
            }
        } else {
            System.out.println("Wi wweli newernij mesjac");
        }
    }
}

//Добавил ограничение по кол-ву дней и месяцев. Выводит ошибку.

