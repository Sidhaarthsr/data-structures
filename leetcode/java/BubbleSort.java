public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,8,9,3,7,6};
        System.out.println("Enter array before sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        bubbleSort(arr);
        System.out.println("Enter array after sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for (int j = 1; j < n-i; j++) {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }   
            }
        }
    }
}
