import java.util.*;
public class Consonant
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
                if("AEIOU".indexOf(ch)>=0)
                    continue;
				c++;
            }
		}	
            System.out.println("No. of consonants:"+c);
    }
}    
        