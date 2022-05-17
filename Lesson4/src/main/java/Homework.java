
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.


public class Homework {
    public static int getRandom() {
        return (int) (Math.random() * 7) + 1;
    }

    public static void main(String[] args) {
        int x = getRandom();
        System.out.println(x);
        switch (x) {
            case 1:
                System.out.println("Ponedelnik");
                break;
            case 2:
                System.out.println("Wtornik");
                break;
            case 3:
                System.out.println("Sreda");
                break;
            case 4:
                System.out.println("Chetwerg");
                break;
            case 5:
                System.out.println("Pyatnica");
                break;
            case 6:
                System.out.println("Subbota");
                break;
            case 7:
                System.out.println("Woskresenje");
                break;
        }
    }
}
