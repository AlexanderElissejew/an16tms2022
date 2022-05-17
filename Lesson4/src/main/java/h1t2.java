//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа

public class h1t2 {
    public static void main(String[] args) {

        int k = 1;
        for (int a = 1; a < 25; a++) {
            if (a % 3 == 0) {
                k = k * 2;
                System.out.println("Proshlo stolko chasow: " + a + " Stalo stolko ameb: " + k);
            }
        }
    }
}
