import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int len = s.length();
            if (len > 10) {
                s = s.charAt(0) + "" + (len - 2) + s.charAt(len - 1);
            }
            System.out.println(s);
        }
        scanner.close();
    }
}