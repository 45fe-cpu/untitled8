import java.util.Scanner;

public class task3 {
    public static boolean Recursive(int n, int divisor) {
        if (n < 2) return false;
        if (divisor == 1) return true;
        if (n % divisor == 0) return false;
        return Recursive(n, divisor - 1);
    }

    public static String Prime(int n) {
        return Recursive(n, n - 1) ? "Prime" : "Composite";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Prime(n));
        scanner.close();
    }
}

