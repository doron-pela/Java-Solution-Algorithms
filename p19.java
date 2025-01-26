import java.util.*;

public class p19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println(n / 2);
            } else {
                System.out.println((n - 1) / 2);
            }
        }
        scanner.close();
    }
}