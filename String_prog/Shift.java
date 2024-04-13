import java.util.*;
public class Shift
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        String n , ns ="";
        int i,l,x,j;
        char ch,ch1=' ' ;
        System.out.println("enter the word or sentence :");
        n=sc.nextLine();
        l=n.length();
        
       /**/
        for(i=0;i<l;i++)
        {
          ch=n.charAt(i);
          x=ch;
          for(j=1;j<=2;j++)
          {
              x++;
              if(x==91)
              x=65;
              if(x==123)
              x=97;
              else
              continue;
          }
          ns=ns+(char)x;
        }
        System.out.println("New : "+ns);
    }
        
    }
