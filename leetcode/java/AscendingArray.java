import java.util.Scanner;

public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print array before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                }
            }
            System.out.println();
        System.out.println("Print array after sorting in ascending:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }  
    }
}
