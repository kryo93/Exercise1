import java.util.Scanner;
import java.lang.String;

public class ex3 {

    public static void main(String[] aregs) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Word");
        s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < (char) 91 && s.charAt(i) > (char) 64) || (s.charAt(i) < (char) 123 && s.charAt(i) > (char) 96)) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    System.out.println(s.charAt(i) + "- Vowel");
                } else {
                    System.out.println(s.charAt(i) + "- consonant");
                }
            } else {

                System.out.println(s.charAt(i) + "- invalid entry");

            }

        }
    }
}