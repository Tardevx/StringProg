import java.util.*;
public class Pfreq
{
    public static void main(String args[])
    {
        String s , w="",st1="" ;
        int i , l;
        char ch ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        s = sc.nextLine();
        s=s.trim();
        s= s+ " ";
        l=s.length();
        
        for (i=0;i<l;i++)
        {
           ch=s.charAt(i);
           if(ch != ' ')
             {
              w = w+ch;
              st1= ch +st1;
            }
             
           else
             {
                 if(st1.equalsIgnoreCase(w))
                   System.out.println(w);
                 w="";
                 st1="";
             }
        }
    }
}