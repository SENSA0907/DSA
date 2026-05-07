package JAVA.Arrays;

public class BinerySearch {

    static int binarySearch(int[] arr, int value) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid;

        boolean isAscending  = arr[low] < arr[high];

        while(low <= high) {
            mid = (low+high)/2;
            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                if (isAscending) {
                    low = mid + 1;
                } else high = mid -1;
            } else {
                if (isAscending) {
                    high = mid - 1;
                } else low = low + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,5,8,23,45,67}, 67));
        System.out.println(binarySearch(new int[]{1,5,8,23,45,67}, 1));
        System.out.println(binarySearch(new int[]{100, 80, 15, 5,1}, 1));
    }
}
