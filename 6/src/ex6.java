import java.util.Scanner;

public class ex6
{
    public static void main(String args[])
    {
        System.out.println("Enter the character");
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if(((int)a>64 && (int)a<92) || ((int)a>47 && (int)a<58) || ((int)a>96 && (int)a<122))
        {


            if ((int) a > 64 && (int) a < 92) {
                System.out.println("Capital Letter");
            }
            if ((int) a > 96 && (int) a < 122) {
                System.out.println("Small Letter");
            }
            if ((int) a > 47 && (int) a < 58) {
                System.out.println("A digit");
            }
        }
        else
        {

            System.out.println("Something Else");
        }


    }
}
