import java.util.*;

public class p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();

            String s1 = 'a' + s;
            String s2 = s + 'a';

            int l1 = 0;
            int r1 = s1.length() - 1;
            boolean x = true;
            while (l1 < r1) {
                if (s1.charAt(l1) != s1.charAt(r1)) {
                    x = false;
                    break;
                }
                l1++;
                r1--;
            }

            if (!x) {
                System.out.println("YES");
                System.out.println(s1);
                continue;
            }

            int l2 = 0;
            int r2 = s2.length() - 1;
            boolean y = true;
            while (l2 < r2) {
                if (s2.charAt(l2) != s2.charAt(r2)) {
                    y = false;
                    break;
                }
                l2++;
                r2--;
            }

            if (!y) {
                System.out.println("YES");
                System.out.println(s2);
                continue;
            }

            if (x && y) {
                System.out.println("NO");
                continue;
            }
        }
        scanner.close();
    }
}