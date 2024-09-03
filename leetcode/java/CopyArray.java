public class CopyArray {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,4,6,7,8};
        int[] arr2=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        System.out.println("Print Original Array: ");
        for (int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Print Copy Array: ");
        for (int i = 0; i < arr2.length; i++) {
           System.out.print(arr2[i] + " ");
        }
    }
}
