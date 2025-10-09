import java.util.*;
class Question80 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 9 == 0) count++;
        }
        System.out.println(count);
    }
}