import java.util.Scanner;
public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print Duplicate Elements:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i]==arr[j])
                    {
                        System.out.print(arr[j] + " ");
                    }
                }
            }
        
    }
}
