
import java.util.HashMap;
class Question10 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }
}
