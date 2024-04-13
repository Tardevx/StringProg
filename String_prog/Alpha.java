import java.util.*;
public class Alpha 
{
    public void disp()
    {
        String st,st1="";
        int i , l,j;
        char ch ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word ");
        st=sc.next();
        st=st.trim();
        l=st.length();
        
        for (i=65;i<=90;i++)
        {
            for(j=0;j<l;j++)
            {
               ch=st.charAt(j); 
               if(ch==(char)i|| ch==(char)(i+32))
                 st1= st1+ch;
            }
            }
        System.out.println(st1);
    }
}