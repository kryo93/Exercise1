import java.util.*;


public class ex8
{
    public static void main(String[] args)
    {
        Random rand= new Random();
        int rand1=rand.nextInt(50);
        System.out.println("Enter the number (1-50)");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(y==rand1)
        {
            System.out.println("yo same");
        }
        if(y<rand1)
        {
            System.out.println("yo less");

        }
        if(y>rand1)
        {
            System.out.println("yo more");
        }
    }
}