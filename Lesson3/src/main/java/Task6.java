public class Task6 {
    public static void main(String[] args) {
        int ave[] = {1, 2, 3, 4, 5};
        double avg;
        int sum = 0;
        int n = ave.length;
        for (int i = 0; i < n; i++) {
            sum += ave[i];
        }
        avg = (double) sum / n;
        System.out.println(avg);
    }
}
