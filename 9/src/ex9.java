import java.util.*;



public class ex9
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();

        int n= s.length()-1;
        int i=0;

        char ch[]=s.toCharArray();
        while(n>=0)
        {
            ch[i]=s.charAt(n);
            i++;n--;

//            char ch[] = s.toCharArray();
//            char temp = ch[i];
//            ch[i] = ch[n];
//            ch[n] = temp;
//
//
//////            s.charAt(n-1)= u;
//            n--;
//            i++;
//
        }
        System.out.println(ch);
    }
}