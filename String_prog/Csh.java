import java.util.*;
public class Csh 
{
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);
		String s,st="";
		int i ,l ;
		char ch , ch1=' ';
		System.out.println("Enter a string :");
		s=sc.nextLine();
		s=s.trim();
		s=s.toUpperCase();
		l=s.length();
		
		for(i=0;i<l;i++)
		{
           ch=s.charAt(i);
           ch1=(char)(ch+2);
            if(ch1=='Y')
             ch1='A';
            if(ch1=='Z')
              ch1='B';
            st=st+ch1;			
        }
		System.out.println("New string :"+st);
    }
}