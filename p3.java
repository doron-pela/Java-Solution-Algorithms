import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            long n = scanner.nextLong();
            long sheets = 1;
            while (h % 2 == 0) {
                h = h / 2;
                sheets = sheets * 2;
            }
            while (w % 2 == 0) {
                w = w / 2;
                sheets = sheets * 2;
            }
            if (sheets >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}