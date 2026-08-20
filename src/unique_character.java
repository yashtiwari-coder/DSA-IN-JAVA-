import java.util.Scanner;
public class unique_character {
    public static void main(String[] args) {
        String str = "programming";
        int[] ar = new int[128];
        for (char ch : str.toCharArray()) {
            ar[ch]++;
        }
        for (char ch : str.toCharArray()) {
            if (ar[ch] == 1) {
                System.out.println(ch + " " + ar[ch]);
                ar[ch] = 0;
                break;
            }
        }
    }
}