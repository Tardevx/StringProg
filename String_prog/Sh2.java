import java.util.*;
public class Sh2
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
        

         for(i=0;i<l;i++)
        {
            ch=n.charAt(i);
            x=ch;
            if(x<=89 || x<=121)
             ch1=(char)(x+2);
            else 
             ch1=(char)(x-26+2);
            ns=ns+ch1;
        }
        System.out.println("New : "+ns);
        }
        
    }
        