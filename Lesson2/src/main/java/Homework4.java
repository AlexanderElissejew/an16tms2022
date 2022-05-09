import java.util.Scanner;
import java.lang.Math;

public class Homework4 {
        public static void main(String[] args)
        {
            System.out.println("Wwedite perwoe chislo: ");
            Scanner a = new Scanner(System.in);
            double b = a.nextDouble();
            System.out.println("Wwedite wtoroe chislo: ");
            double c = a.nextDouble();

            double d1 = (Math.pow(b,2)) + (Math.pow(c,2));
            System.out.println("Gipotenusa: " + d1);

            a.close();

        }

    }

