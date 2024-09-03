import java.util.Scanner;
public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string:");
        String s =sc.nextLine();
        s=s.toLowerCase();
        int vCount=0, cCount=0 ;
       
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
              vCount++;  
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                cCount++;
            }
        }
        System.out.println("Enter no of vowels:" + vCount);
        System.out.println("Enter no of consonants:" + cCount);
    }
}
