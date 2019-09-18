import java.util.Scanner;

public class ex5
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum=0;
        int arr [];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter number " + (i+1));
            int y= in.nextInt();
//             if((int)y!=y)
//             {
//                 System.out.println("Wrong Entry");
//                 break;
//             }
            sum+=y;
        }
        System.out.println("sum =" + sum);
    }
}