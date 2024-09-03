public class ReverseWords {
    public static void main(String[] args) {
        String s="Hello Sushmitha";
        String[] words=s.split(" ");
        String reverse=" ";
        for (String word : words) {
            String reversedWord=" ";
            for(int i=word.length()-1;i>=0;i--)
            {
                reversedWord=reversedWord+word.charAt(i);
            }
            reverse=reverse+reversedWord;
        }
        System.out.print("Print Original String:"+s);
        System.err.println();
        System.out.print("Print Reversed String:"+reverse);
    }
}
