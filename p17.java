import java.util.*;

public class p17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        int t = scanner.nextInt();
        String line = scanner.next();
        char[] lineArr = line.toCharArray();

        for (int time = 0; time < t; time++) {
            for (int i = 0; i < lineArr.length - 1; i++) {
                if (lineArr[i] == 'B' && lineArr[i + 1] == 'G') {
                    char temp = lineArr[i];
                    lineArr[i] = lineArr[i + 1];
                    lineArr[i + 1] = temp;
                    i++;
                }
            }
        }

        System.out.println(String.valueOf(lineArr));
        scanner.close();
    }
}
