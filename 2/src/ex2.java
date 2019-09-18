

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args)
    {
        System.out.println("Enter the number ");
        int x;
        Scanner in = new Scanner(System.in);
        x=in.nextInt();

        if((x>=20 && x<=30) && (x%2==0))
        {
            System.out.println("Jerry");
        }
        if((x>20 && x<30) && (x%2!=0))
        {
            System.out.println("Jerry");
        }
        if((x<20 && x>30))
        {
            System.out.println("dont know");
        }

    }
}