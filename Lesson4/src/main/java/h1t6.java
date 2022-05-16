//**
// * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
//* - if number положительное число, то необходимо number увеличить на 1
// * - if number отрицательное - уменьшить на 2
// * - if number равно 0 , то замените значение number на 10
//* вернуть number после выполнения операций


import java.util.Scanner;

public class h1t6 {
    public static void main(String[] args) {
        int f;
        Scanner scann = new Scanner(System.in);
        f = scann.nextInt();
        if (f > 0) {
            f += 1;
            System.out.println(f);
        } else if (f < 0) {
            f -= 2;
            System.out.println(f);
        } else {
            f = 10;
            System.out.println(f);
        }
    }
}
