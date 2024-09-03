public class BinarySearch {
    public static void main(String[] args) {
        final int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        final int target = 0;
        final int targetPosition = binarySearch(array, target);
        System.out.println("Target Position : " + targetPosition);

    }

    private static int binarySearch(final int[] array, final int target) {
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int middle = low + (high - low) / 2;
            final int middleElement = array[middle];
            System.out.println("Middle Element : " + middleElement);
            if (middleElement > target) {
                high = middle - 1;
                continue;
            } else if (middleElement < target) {
                low = middle + 1;
                continue;
            } else  {
                return middle;
            }
        }
        return -1;
    }
}
