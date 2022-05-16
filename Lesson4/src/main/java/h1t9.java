//  /**
//     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
//     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
//     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
//     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
//     */

import java.util.Scanner;

public class h1t9 {
    public static void main(String[] args) {
        int o;
        Scanner scan = new Scanner(System.in);
        o = scan.nextInt();
        if (o % 5 == 0 && o % 3 == 0) {
            System.out.println("foobar");

        } else if (o % 3 == 0) {
            System.out.println("foo");
        } else if (o % 5 == 0) {
            System.out.println("bar");
        }

    }
}
