// * 2) класс Computer будет содержать следующие методы:
//     * - метод описание(вывод всех полей)
//     * - метод включить (on())
//     *     - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
//     *     на консоль вывести сообщение (Внимание! Введите 0 или 1)
//     *     создать экземпляр класса Random, который будет генерировать число 0 или 1.
//     *     если введенное вами число совпадет с рандомным, то компьютер выключается.
//     *     если введенное вами число не совпадет с рандомным, то компьютер сгорает.
//     *     - при повторном включении компьютера, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"
//     * - выключить (off()) Проверяем если компьютер не сгорел то пишем "Выключение компьютера" и уменьшаем счетчик
//     *    ресурса полных циклов работы
//     * - при превышении лимита ресурса комп сгорает. Пишем сообщение "Компьютер сгорел!"
//     *
//     * 3) создать пакет by.tms.service
//     * создать класс Main создать метод main
//     * создать экземпляр класса Computer или реальный объект, через конструктор передать значение полей класса,
//     * т.е необходимо сгенерировать конструктор с полями класса перечисленными в 1 пункте
//     * Далее у объекта Computer вызвать его методы, в которых будет реализована логика по включению, выключению
//     * и выводу информации про него.
//     */

package by.tms.model;

import java.util.Scanner;

public class Computer {
    public String prozessor;
    public String operatiwka;
    public String zestkiyDisk;
    public int recurs = 2;

    public Computer(java.lang.String prozessor, java.lang.String operatiwka, java.lang.String zestkiyDisk) {
        this.prozessor = "Icore i-5";
        this.operatiwka = "8gb RAM";
        this.zestkiyDisk = "512SSD";
    }

    public void description() {
        System.out.println(prozessor + ", " + operatiwka + ", " + zestkiyDisk);
    }

    public void on() {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Computer wkluchilsja");
        System.out.println("Wnimanie! Wwedite 0 ili 1: ");
        a = scanner.nextInt();
        if (a == getRandom()) {
            System.out.println("wikluchenie.....");
            System.out.println("Computer wikluchilsja");
            off();
        } else {
            System.out.println("Computer zagorelsja");
        }
    }

    public static double getRandom() {
        int min = 0;
        int max = 1;
        int rand = (int) (Math.random() * ((max - min) + 1)) + min;
        return rand;
    }

    public int off() {
        System.out.println("wklu4enie.....");
        while (recurs > 0) {
            --recurs;
            System.out.println("Ostalocj coklow: " + recurs);
            on();
            return recurs;
        }
        if (recurs == 0) {
            System.out.println("Sgorel :(");
        }
        return recurs;
    }

}

