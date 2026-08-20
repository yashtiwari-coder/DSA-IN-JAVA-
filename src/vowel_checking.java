public class vowel_checking {
    public static void main(String[] args) {

        String s = "hello";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                System.out.println("Vowel: " + ch);
                System.out.println("Index: " + i);
                break;   // first vowel ke liye
            }
        }
    }
}