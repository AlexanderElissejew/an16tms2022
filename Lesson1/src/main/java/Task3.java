import java.util.Scanner;

public class Task3 {
    public static int chek(int n) {
        int x = 0;
        if (n > 0) {
            x = 1;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 5 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        sc.close();
        System.out.println("Number of integer: ");
        System.out.println(chek(a) + chek(b) + chek(c) + chek(d) + chek(e));

    }

}
