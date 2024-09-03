import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s =sc.nextLine();
        String Original_str=s;
        String reverseStr=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverseStr+=s.charAt(i);
        }
        if(Original_str.equals(reverseStr))
        {
            System.out.println(Original_str+ "is a Palindrome");
        }
        else{
            System.out.println(Original_str+ " not a Palindrome");
        }

    }
}
