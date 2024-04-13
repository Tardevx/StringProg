import java.util.*;
public class first
{
    public void disp()
    {
        String st,st1="";
        int i,l,p;
        char ch ,ch1 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a sentence ");
        st=sc.nextLine();
        st = st.trim();
        st = " " +st;
        l=st.length();
        
        for(i=0;i<l-1;i++)
        {
            ch = st.charAt(i);
            ch1 = st.charAt(i+1);
            if (ch==' '&& ch1 != ' ')
            {
                st1 = st1 +ch1+" ";
                
            }
        }
        
        System.out.println(st1);
    }
}