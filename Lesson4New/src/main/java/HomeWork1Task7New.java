//**
//* На вход приходит массив целых чисел типа int
//* Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
//* в котором это значение распечатается на консоль.
//*/
//

public class HomeWork1Task7New {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}

//Переделал под нечётные элементы, а то было чётные