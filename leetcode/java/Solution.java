import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        final Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        String[] inputs = new String[test];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLine();
        }
        for (int i = 0; i < inputs.length; i++) {
            String s = inputs[i];
            char[] oddCharacters = new char[s.length() / 2];
            char[] evenCharacters = new char[s.length() / 2 + 1];
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    evenCharacters[j / 2] = s.charAt(j);
                } else {
                    oddCharacters[j / 2] = s.charAt(j);
                }
            }
            for(int k = 0; k < evenCharacters.length; k++) {
                System.out.print(evenCharacters[k]);
            }
            System.out.print(" ");
            for(int k = 0; k < oddCharacters.length; k++) {
                System.out.print(oddCharacters[k]);
            }
            System.out.println();
        }
    }
}