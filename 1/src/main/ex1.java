import java.util.*;
import java.lang.Math;
public class ex1
{

    public static void pallin(int u)
    {

        int t=u;
        int n=0;
        while(t/10!=0)
        {
            n++;
            t=t/10;
        }
        t=u;
        // System.out.println(n);

        double sum=0;
        int sum2=0;


        while(t/10!=0)
        {
            int r=0;
            r  =t%10;
            //  System.out.println("left = " + u);
            sum=sum+(r*Math.pow(10,n));
            if(r%2==0)
            {
                sum2=sum2+r;
            }
            n--;
            //  System.out.println("sum = " + sum);
            t=t/10;
            //  System.out.println(t);


        }
        sum=sum+t;

        // System.out.println(sum);

        if((int)sum==u)
        {
            System.out.println("Pallindrome");
            System.out.println("sum = " + sum2);
        }
        else
            System.out.println("not a pallindrome");

    }


    public static void main(String[] args)
    {
        System.out.println("Enter the number ");
        int x;
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        input.close();

        pallin(x);
    }

}
