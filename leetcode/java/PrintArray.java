import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class PrintArray {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
            }
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.print(array[i] + " ");
        }
          
    }
}