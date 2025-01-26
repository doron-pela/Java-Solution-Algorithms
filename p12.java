import java.util.*;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stmts = scanner.nextInt();
        int X = 0;
        while (stmts-- > 0) {
            String stmt = scanner.next();
            if (stmt.contains("+")) {
                ++X;
            } else if (stmt.contains("-")) {
                --X;
            }
        }
        System.out.println(X);
        scanner.close();
    }
}
