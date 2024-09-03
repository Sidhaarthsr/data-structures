public class ReverseString {
    public static void main(String[] args) {
        String s="Learn Java";
        String reverse=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        System.out.print("Print Original String:"+s);
        System.err.println();
        System.out.print("Print Reversed String:"+reverse);
    }
}
