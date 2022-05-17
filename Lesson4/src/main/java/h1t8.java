//**
//* На вход приходит число.
//* Вывести в консоль фразу из разряда "_COUNT_ программистов",
//* заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
//* уместное с точки зрения русского языка.
//* Пример: 1 программист, 42 программиста, 50 программистов
//*
//* @param count - количество программистов
//*/

import java.util.Scanner;

public class h1t8 {
    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        int p = count % 10;
        if (p == 1) {
            System.out.println(count + " programmist");
        } else if (p > 1 && p < 5) {
            System.out.println(count + " programmista");
        } else {
            System.out.println(count + " programmistow");
        }
    }
}
