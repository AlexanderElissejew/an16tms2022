import java.util.Scanner;

//Задачи:
//1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

public class Homeworkl3 {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }


        //2)Проверка четности числа
        //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
        // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
        // Если пользователь введёт не целое число, то сообщать ему об ошибке.

        Scanner in = new Scanner(System.in);
        System.out.print("Wwedite chislo: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("Chetnoe");
        } else {
            System.out.println("Nechetnoe");
        }
        in.close();
    }

    //3) Меньшее по модулю число
    //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
    // пользователем вещественных чисел с консоли.

    static void moduli() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wwedite 3 chisla: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        float mm = Math.min(a, b);
        float min = Math.min(mm, c);
        System.out.println("Menshee: " + min);
        scan.close();
    }

//4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
// оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
// когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
// (т.е. рабочий день закончился).
//Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
// Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
// сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
//Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
// далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
// выводиться фраза о количестве полных часов, содержащихся в n секундах.

    public static void z4(String[] args) {
        int[] nums = new int[28800];
        int n = (int) Math.floor(Math.random() * nums.length);
        int x = nums.length - n;
        int s = x / 3600;
        System.out.println("Proshlo " + n + " secund");
        System.out.println("Ostalosj " + x + " secundi");
        if (s < 5 && s > 1) {
            System.out.println("Ostalosj " + s + " chasa");
        }
        if (s > 4) {
            System.out.println("Ostalosj " + s + " chasow");
        }
        if (s < 2 && s != 0) {
            System.out.println("Ostalsja " + s + " chas");
        }
        if (s < 1) {
            System.out.println("Ostalosj sovsem nemnogo");
        }
    }


//5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn

    public static void tablica(String[] args) {
        System.out.println("             byte\tshort\tchar\tint \tlong\tfloat\tdouble\tboolean");
        System.out.println("byte         t   \tnja  \tja  \tnja \tnja \tnja  \tnja   \tx      ");
        System.out.println("short        ja  \tt    \tja  \tnja \tnja \tnja  \tnja   \tx      ");
        System.out.println("char         ja  \tja   \tt   \tnja \tnja \tnja  \tnja   \tx      ");
        System.out.println("int          ja  \tja   \tja  \tt   \tnja \tnja  \tnja   \tx      ");
        System.out.println("long         ja  \tja   \tja  \tja  \tt   \tnja  \tnja   \tx      ");
        System.out.println("float        ja  \tja   \tja  \tja  \tja  \tt    \tnja   \tx      ");
        System.out.println("double       ja  \tja   \tja  \tja  \tja  \tja   \tt     \tx      ");
        System.out.println("boolean      x   \tx    \tx   \tx   \tx   \tx    \tx     \tt      ");
    }
}

// Дополнительное не успеваю, мб за завтра пришлю