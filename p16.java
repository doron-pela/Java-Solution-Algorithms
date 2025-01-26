import java.util.*;

public class p16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        y++;
        System.out.println(f(y));
        scanner.close();
    }

    private static int f(int year) {
        String str = String.valueOf(year);

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return f(year + 1);
                }
            }
        }

        return year;
    }
}