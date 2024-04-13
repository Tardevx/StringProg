import java.util.*;
public class PigLatin
{
        public static void main(String[] args)
        {
        String st,st1="",st2="",st3="" ;
        int i , l ;
        char ch ;
		boolean p=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
		st = sc.next();
		st=st.toUpperCase();
        st=st.trim();
        l=st.length();
        for(i=0;i<l;i++)
        {
                ch=st.charAt(i);
                if(ch=='A'|| ch == 'E'|| ch=='I'||ch=='O'|| ch =='U')
                {
                        st1=st.substring(i);
                        st2 = st.substring(0,i);
						System.out.println("It is PigLatin word ");
                        st3 = st1+st2+"AY";
						p=true;
                        System.out.println(st3);
                        break;
                }
                
          }
		  if(p==false)
			  System.out.println("It is not a piglatin word");

  }
}