import java.util.*;
class Question25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a += 2;
        }
    }
}