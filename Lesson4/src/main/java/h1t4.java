
////4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
//


public class h1t4 {
    public static void main(String[] args) {
        int d = 21;
        int m = 10;
        switch (m) {
            case 1:
                if (d < 21) {
                    System.out.println("Kozerog");
                } else {
                    System.out.println("Wodolej");
                }
                break;
            case 2:
                if (d < 20) {
                    System.out.println("Wodolej");
                } else {
                    System.out.println("Ribi");
                }
                break;
            case 3:
                if (d < 21) {
                    System.out.println("Ribi");
                } else {
                    System.out.println("Owen");
                }
                break;
            case 4:
                if (d < 21) {
                    System.out.println("Owen");
                } else {
                    System.out.println("Telec");
                }
                break;
            case 5:
                if (d < 22) {
                    System.out.println("Telec");
                } else {
                    System.out.println("Blizneci");
                }
                break;
            case 6:
                if (d < 22) {
                    System.out.println("Blizneci");
                } else {
                    System.out.println("Rak");
                }
                break;
            case 7:
                if (d < 23) {
                    System.out.println("Rak");
                } else {
                    System.out.println("Lew");
                }
                break;
            case 8:
                if (d < 24) {
                    System.out.println("Lew");
                } else {
                    System.out.println("Dewa");
                }
                break;
            case 9:
                if (d < 24) {
                    System.out.println("Dewa");
                } else {
                    System.out.println("Wesi");
                }
                break;
            case 10:
                if (d < 24) {
                    System.out.println("Wesi");
                } else {
                    System.out.println("Scorpion");
                }
                break;
            case 11:
                if (d < 23) {
                    System.out.println("Scorpion");
                } else {
                    System.out.println("Strelec");
                }
                break;
            case 12:
                if (d < 23) {
                    System.out.println("Strelec");
                } else {
                    System.out.println("Kozerog");
                }
                break;
        }

    }
}


