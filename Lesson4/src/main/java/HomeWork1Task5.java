
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork1Task5 {
    public static void main(String[] args) {
        int j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wwedite dlinnu massiwa: ");
        j = scan.nextInt();
        while (j < 0) {
            System.out.println("Wi wweli newernoe chislo");
            System.out.println("Wwedite dlinnu massiwa: ");
            j = scan.nextInt();
        }
        int[] array = new int[j];
        Random rand = new Random();
        for (int k = 0; k < array.length; k++) {
            array[k] = rand.nextInt();
        }
        System.out.print(Arrays.toString(array));

    }
}
