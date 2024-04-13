import java.util.*;
public class Shift2 
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,l;
		String s,st="",st1="",st2="";
		char ch1,ch;
		
		System.out.println("Enter a sentence");
		s=sc.nextLine();
		l=s.length();
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
           ch1=Character.toUpperCase(ch);
    		if(Character.isLetter(ch))
			{
             if(ch1 !='A'|| ch1!='E'||ch1!='I'|| ch1!='O'||ch1!='U')
             System.out.print(ch1);
            }
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ')
				System.out.println(ch);
		    
		}
		
	}
}
		 
