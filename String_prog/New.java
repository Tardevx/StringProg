import java.util.*;
public class  New
{
    public static void main(String args[])
    {
        String st , st1="";
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
              { ch1=st.charAt(j);
            if(ch==ch1)
            { c++;
               //break;
            }
            //else 
              //st1 = st1 + ch1;
          }
          if (c==0)
             st1 = st1 +ch1;
        }
        
         System.out.println(st1);
        
    }
}