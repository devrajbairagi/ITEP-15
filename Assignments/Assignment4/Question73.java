import java.util.*;
class Question73 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for (int i = a; i <= b; i++) {
            boolean perfect = false;
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum += j;
            }
            if (sum == i) System.out.print(i + " ");
        }
    }
}