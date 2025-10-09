import java.util.*;
class Question16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n >= 1) {
            System.out.print(1 + " ");
        }
        if (n >= 2) {
            System.out.print(2 + " ");
        }
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int c = b * b;
            System.out.print(c + " ");
            b = c;
        }
    }
}