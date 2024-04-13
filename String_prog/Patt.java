import java.util.*;
public class Patt
{
    public void disp()
    {
        String s ;
        int i ,l;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the sentence ");
        s=sc.nextLine();
        l=s.length();
        for(i=1;i<=l;i++)
          System.out.println(s.substring(0,i));
    }
}