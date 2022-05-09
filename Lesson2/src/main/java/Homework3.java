import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        System.out.println("Wwedite 2 chisla");
            x = s.nextInt();
            y = s.nextInt();
            if (x > y) {
                System.out.println("Bolshee chislo:" + x);
            }
            else{
            System.out.println("Bolshee chislo:" + y);
        }
    }
}