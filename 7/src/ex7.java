import java.util.Collections;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class ex7
{
    public static void main(String[] args)
    {
        System.out.println("Ok Enter your number");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();



        String s="";

        int u=0;
        while(x/10!=0)
        {
            u=x%10;
            x=x/10;

            s=s+u;
        }
        s=s+x;
//        System.out.println(v);

        String original = s;
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);

//        int n=v.size();
//        int r=1;
//        int sum=0;
//        for(int i=n-1;i>=0;i--)
//        {
//            int p=v.get(i);
//            sum=sum+(p*r);
//            r=r*10;
//        }
//        System.out.println(sum);

    }
}