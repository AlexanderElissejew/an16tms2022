import java.util.Scanner;

public class HomeWork1Task6 {
    public static void main(String[] args) {
        int f;
        Scanner scann = new Scanner(System.in);
        f = scann.nextInt();
        if (f > 0) {
            f += 1;
        } else if (f < 0) {
            f -= 2;
        } else {
            f = 10;
        }
        System.out.println(f);
    }
}