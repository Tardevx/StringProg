import java.util.*;
public class Name 
{
    public void disp()
    {
        String st,st1="",st2="";
        int c ;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a sentence ");
        st=sc.nextLine();
        st = st.trim();
        st = " " +st;
        
        c= st.lastIndexOf(" ");
        st1 = st.substring(c);
        st2 = st.substring(0,c);
        
        
        System.out.println(st1+ st2 );
    }
}