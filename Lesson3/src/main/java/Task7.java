public class Task7 {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 10, 3};
        int maxNumber = array2[0];
        for (int i : array2) {
            if (i > maxNumber)
                maxNumber = i;
        }

        System.out.println("Maximum number = " + maxNumber);
    }
}


