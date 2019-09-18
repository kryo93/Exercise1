import java.util.*;
public class ex10
{
    public static void main(String[] args)
    {
        String s;
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        s= sc.nextLine();
        System.out.println("Enter the number");
        int u= sc.nextInt();
        int n=s.length();
        String s1;
        s1=s.substring(n-u);
        for(int i=0;i<u;i++)
        {
            s=s+s1;
        }
        System.out.println(s);
    }
}