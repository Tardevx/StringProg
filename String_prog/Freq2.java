import java.util.*;
public class Freq2
{
    public void word()
    {
        Scanner sc = new Scanner (System.in);
        String st , st1 ="",w="";
        int i , l,j,l1,c=0;
        char ch, ch1;
        System.out.print("Enter a sentence :");
        st=sc.nextLine();
        System.out.print("enter word to be searched ");
        st1 = sc.next();
        st=st.trim();
        st = st + " ";
        l=st.length();
        for (j=0 ;j<l;j++)
        {
          ch1=st.charAt(j);
          if (ch1!=' ')
          
              w=w+ch1;
          
          else 
          {
              if(w.equalsIgnoreCase(st1))
               {c++;
            
               }
              w="";
          }
        }
        System.out.println("No. of times its is present :  "+c);
    }
} 