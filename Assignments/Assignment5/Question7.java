
import java.util.Arrays;
class Question7 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int result = java.util.Arrays.binarySearch(arr, key);
        if (result >= 0) System.out.println("Element found at index: " + result);
        else System.out.println("Element not found.");
    }
}
