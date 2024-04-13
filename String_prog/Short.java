import java.util.*;
public class Short 
{
    public static void main(String args[])
    {
        String st,st1="",st2="";
        int i,l,cnt=0,cnt1 =1;
        char ch ,ch1,n ;
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
            if ((ch==' '&& ch1 != ' ' ))
            {   cnt++;
                
            }
            
        }
        
        for(i=0;i<l-1;i++)
        {
            ch = st.charAt(i);
            ch1 = st.charAt(i+1);
            if ((ch==' '&& ch1 != ' ' ))
            {   st1 = st1 +ch1;
                if(cnt1<cnt)
                {
                    st1 = st1 +".";
                }
                cnt1++;
                
            }
            
        }
        

        System.out.println(st1);
    }
}
