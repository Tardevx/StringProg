import java.util.*;
public class Longest
{
    public void disp()
    {
        Scanner sc = new Scanner (System.in);
        String s,w="",ns="";
        int i,l,max=0,l1=0;
        char ch ;
        
        System.out.println("Enter the sentence ");
        s=sc.nextLine();
        s=s.trim();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch !=' ')
              {w=w+ch;
                  
              }
            else
            {
                l1 = w.length();
                if(max<l1)
                {
                    max = l1;
                    ns = w;
                    w="";
                }
            }
        }
        System.out.println("Longest word : "+ns+" with "+max+" letters");
    }
}