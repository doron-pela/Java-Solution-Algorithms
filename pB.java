import java.util.*;

public class pB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        StringBuilder word2 = new StringBuilder();
        String firstChar = word.charAt(0) + "";
        word2.append(firstChar.toUpperCase());
        for (int i = 1; i < word.length(); i++) {
            word2.append(word.charAt(i));
        }

        System.out.println(word2.toString());
        scanner.close();
    }
}
