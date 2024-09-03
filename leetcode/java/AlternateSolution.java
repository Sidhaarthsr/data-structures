import java.io.*;
import java.util.*;

public class AlternateSolution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        final Scanner sc = new Scanner(System.in);
        String[] inputs=new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < inputs.length; i++) {
            inputs[i]=sc.nextLine();
        }
        for (int i = 0; i < inputs.length; i++) {
            String input= inputs[i];
            for (int j = 0; j < input.length(); j+=2) {
                System.out.print(input.charAt(j));
            }
            System.out.print(" ");
            for (int j = 1; j < input.length(); j+=2) {
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }

    } 
}