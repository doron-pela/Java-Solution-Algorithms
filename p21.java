import java.util.*;

public class p21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupCount = scanner.nextInt();
        int[] groups = new int[groupCount];
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < groups.length; i++) {
            groups[i] = scanner.nextInt();
            if (groups[i] == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        int remainingTeams = 0;
        if (twos == ones) {
            System.out.println(twos);
        } else if (twos > ones) {
            System.out.println(ones);
        } else {
            int remainingPeople = ones - twos;
            if (remainingPeople >= 3) {
                remainingTeams = (int) Math.floor(remainingPeople / 3);
            } else {
                remainingTeams = 0;
            }

            System.out.println(twos + remainingTeams);
        }
        scanner.close();

    }
}
