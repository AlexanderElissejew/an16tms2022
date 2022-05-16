//**
// * Необходимо прочитать с консоли значение числа типа int,
// * сделать проверку что если пользователь ввел не положительное число,
// * то вывести ошибку и отправить пользователя вводить заново новое число!
// * далее создать одномерный массив типа int размера прочитанного с консоли
// * далее заполнить массив случайными значениями
// * далее вывести массив на консоль
// */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class h1t5 {
    public static void main(String[] args) {
        int j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wwedite dlinnu massiwa: ");
        j = scan.nextInt();
        while (j < 0) {
            System.out.println("Wi wweli newernoe chislo");
            scan.next();
        }
        int[] array = new int[j];
        Random rand = new Random();
        for (int k = 0; k < array.length; k++) {
            array[k] = rand.nextInt();
        }
        System.out.print(Arrays.toString(array));

    }
}
