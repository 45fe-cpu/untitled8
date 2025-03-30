import java.util.Scanner;

public class task2 {
    public static double average(int[] arr, int n) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(average(arr, n));

        scanner.close();
    }
}
