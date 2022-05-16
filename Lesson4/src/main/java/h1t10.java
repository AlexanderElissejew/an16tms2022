//  /**
//     * Задача со звездочкой!
//     * Метод должен печатать все простые числа <1000
//     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
//     */

public class h1t10 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        for (int i = 2; i < array.length; i++) {
            int count = 0;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
