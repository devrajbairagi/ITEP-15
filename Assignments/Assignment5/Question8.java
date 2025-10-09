
class Question8 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
