import java.util.*;

public class p15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int check = str1.compareToIgnoreCase(str2);
        if (check < 0) {
            System.out.println(-1);
        } else if (check > 0) {
            System.out.println(1);
        } else {
            System.out.println(str1.compareToIgnoreCase(str2));
        }

        scanner.close();
    }
}
