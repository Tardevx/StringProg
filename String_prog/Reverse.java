import java .util.*;
public class Reverse
{
    public  void disp()
    {
        Scanner sc = new Scanner(System.in);
        String st ,w="",st1="",st2="";
        int l , i ,j,l1;
        char ch , ch1;
        System.out.print("Enter sentence :  ");
        st=sc.nextLine();
        st=st.trim();
        st=st+" ";
        l= st.length();
        for(i=0;i<l;i++)
        {
            ch1=st.charAt(i);
            if(ch1== ' ')
               w=w+ch1;
            else
            {
                l1=w.length();
                for(j=0;j<l1;j++)
                {
                    ch=w.charAt(j);
                    st1 = ch+st1;
            
                }
                st2 = st2+" ";
                st2 = st2 + st1;
                
                
            }
            w="";
            st1="";
        }
        System.out.println("New String: "+st2);
    }
}