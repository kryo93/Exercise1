import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s="";
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < i; j++)
            {
                s= s+ i;
            }
        }
        System.out.println(s);
    }
}