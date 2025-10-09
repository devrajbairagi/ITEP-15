
class Question9 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
