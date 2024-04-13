import java.util.*;
public class Case 
{
    public void disp()
    {
        String st,st1="",st2="";
        int i,l,c=0;
        char ch ,ch1,n ;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a sentence ");
        st=sc.nextLine();
        st = st.trim();
        st = " " +st ;
       
        l=st.length();
        for(i=0;i<l;i++)
        {
            ch = st.charAt(i);
            
            if(Character.isLetter(ch))
            {
                if (Character.isLowerCase(ch))
                 st1 =st1+Character.toUpperCase(ch);
                 else 
                 st1 = st1+Character.toLowerCase(ch);
            }
            else 
            st1 = st1 +ch;
        }
        
        System.out.println(st1 );
    }
}