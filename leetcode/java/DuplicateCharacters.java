import java.util.Scanner;
public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        char[] str=s.toCharArray();
        int count;
        System.out.println("Print duplicate Characters:");
        for(int i=0;i<str.length;i++)
        {
            count=1;
            for(int j= i+1;j<str.length;j++)
            {
                if(str[i]==str[j] && str[i]!=' ')
                {
                    count++;
                    str[j]='0';
                }

            }
            if(count>1 && str[i]!='0')
            {
                System.out.println(str[i]);
            }
        }
    }
}
