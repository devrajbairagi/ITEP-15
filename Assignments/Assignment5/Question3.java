
class Question3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) evenSum += arr[i];
            else oddSum += arr[i];
        }
        System.out.println("Sum of even elements: " + evenSum);
        System.out.println("Sum of odd elements: " + oddSum);
    }
}
