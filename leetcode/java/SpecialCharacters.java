import java.util.Scanner;
public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.' ||  s.charAt(i) == '?' || s.charAt(i) == '-' ||    
s.charAt(i) == '\''  || s.charAt(i) == ':')
         {
            count++;
         }   
        }
        System.out.println("No of Special Characters:" +count);
    }
}
