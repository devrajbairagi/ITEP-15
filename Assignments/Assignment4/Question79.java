import java.util.*;
class Question79 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((int)Math.pow(i, 4) + " ");
        }
    }
}