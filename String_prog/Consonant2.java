import java.util.*;
public class Consonant2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s;
        char ch=' ';
        int i , l,c=0;
        //accepting string 
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        //processing
        for(i=0;i<l;i++)
		{ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
                    c++;
            }
		}	
            System.out.println("No. of consonants:"+c);
    }
}    
        