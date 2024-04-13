import java.util.*;
public class task
{
    public void disp()
    {
        String s;
        int i , c =0,cu=0,cl=0,l;
        char ch ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        s = sc . nextLine();
        s=s.trim();
        l=s.length();
        
        for(i=0;i<l;i++)
        {
            ch = s.charAt(i);
            if(ch==' ')
              c++;
            else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
               cu++;
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               cl++;
               
        }
        System.out.println("No. of words: "+(c+1));
        System.out.println("No. of Uppercase vowels: "+cu);
        System.out.println("No. of Lower case vowels: "+cl);
    }
}