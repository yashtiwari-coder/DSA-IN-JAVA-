import java.util.Scanner;

public class freuency_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] feq = new int[10];

        while (n != 0) {

            int digit = n % 10;

            feq[digit] = feq[digit] + 1;

            n = n / 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " = " + feq[i]);
        }
    }
}