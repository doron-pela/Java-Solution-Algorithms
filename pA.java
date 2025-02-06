import java.util.*;

public class pA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int rating = scanner.nextInt();
            if (rating <= 1399) {
                System.out.println("Division 4");
            } else if (rating >= 1400 && rating <= 1599) {
                System.out.println("Division 3");
            } else if (rating >= 1600 && rating <= 1899) {
                System.out.println("Division 2");
            } else if (rating >= 1900) {
                System.out.println("Division 1");
            }
        }

        scanner.close();
    }
}