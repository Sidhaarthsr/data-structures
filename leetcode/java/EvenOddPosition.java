import java.util.Scanner;

public class EvenOddPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Even Position");
        for (int i = 1; i < arr.length; i+=2) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.println("Print odd Position");
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i] +" ");
        }
    }
}

