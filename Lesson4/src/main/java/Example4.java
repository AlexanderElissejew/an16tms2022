import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        int[] t = {1, 1, 1};
        int[] t1 = t;
        Arrays.equals(t, t1);
        System.out.println(Arrays.equals(t, t1));

        int month = 12;
        switch (month) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
            default:
                System.out.println("error 404");
        }
        int i = 0;
        for (i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }

        int kl = 100;
        int lk = 200;
        while (kl != lk) {
            kl++;
            lk--;
        }
        System.out.println("Srednee " + kl);
        System.out.println("Srednee " + lk);
        // for (Инициализация; лог выражение; обновление)
    }
}
