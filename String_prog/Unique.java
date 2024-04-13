import java.util.*;
public class Unique
{
    public static void main(String args[])
    {
        String st ;
        int l , i , c=0,j ;
        char ch,ch1=' ' ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        st = sc.next();
        //st=st.trim();
        st = st.toUpperCase();
        //st = st+ " ";
        l= st.length();
        
        for(i=0;i<l;i++)
        {
            ch=st.charAt(i);
            for (j= i+1; j<l; j++)
              { if (st.indexOf(ch,j)!=-1)
				 c=1; 
			    break;
              }
          }
        
        if (c==0)
         System.out.println("It is unique string");
        else 
          System.out.println("It is nOT A  unique string");
    }
}