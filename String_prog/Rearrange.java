import java.util.*;
public class Rearrange
{
    public static void main (String args[])
    {
        String s,st1="" ;
        int i ,l;
        char ch;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the sentence ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(Character.isLetter(ch))
              {
                  if(Character.isUpperCase(ch))
                  st1=st1+ch;
                
              }
         
        }
    for(i=0;i<l;i++)
    {
         ch=s.charAt(i);
         if (Character.isLowerCase(ch))
                  st1=st1+ch;
    }
    for(i=0;i<l;i++)
    {
           ch=s.charAt(i);
        if(Character.isDigit(ch))
                st1=st1+ch;
            
    }
    for(i=0;i<l;i++)
    {
         ch=s.charAt(i);
        if(!(Character.isLetterOrDigit(ch)))
                st1=st1+ch;
    }
    
    
        System.out.println("new string : "+st1);
   
    }
    
} 

