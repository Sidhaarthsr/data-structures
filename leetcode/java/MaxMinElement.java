import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Print Maximum Element:" + max);
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Print Minimum Element:" + min);
    }
}