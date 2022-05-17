//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

import java.util.Scanner;

public class h1t3 {
    public static void main(String[] args) {
        int g;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wwedite chislo: ");
        g = scan.nextInt();
        int h = g;
        h = Math.abs(h);
        int len = String.valueOf(h).length();
        if (g >= 0) {
            System.out.println(g + " Eto polozitelnoe 4islo, koli4estwo cifr = " + len);
        } else {
            System.out.println(g + " Eto otricatelnoe 4islo, koli4estwo cifr = " + len);
        }

    }
}
