public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={9,4,8,5,6,7};
    System.out.println("Enter array before sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        insertionSort(arr);
        System.out.println("Enter array after sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
   public static void insertionSort(int[] arr)
   {
    for(int i=1;i<arr.length;i++)
    {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
   } 


}
