import java.util.*;
public class Initials 
{
    public void disp()
    {
        String st,st1="",n="", st2="";
        int i,l,p;
        char ch ,ch1 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a sentence ");
        st=sc.nextLine();
        st = st.trim();
        st = " " +st;
        l=st.length();
        p= st.lastIndexOf(' ');
        n= st.substring(p);
        for(i=0;i<p;i++)
        {
            ch = st.charAt(i);
            ch1 = st.charAt(i+1);
            if (ch==' '&& ch1 != ' ')
            {
                st1 = st1 +ch1+".";
                
            }
        }
        st2 = st1 +n;
        System.out.println(st2);
    }
}