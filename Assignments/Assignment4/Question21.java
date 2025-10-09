import java.util.*;
class Question21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(((2 * i - 1) * (2 * i - 1)) + " ");
        }
    }
}