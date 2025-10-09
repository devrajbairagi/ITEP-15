import java.util.*;
class Question15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int term = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += i + 1;
        }
    }
}