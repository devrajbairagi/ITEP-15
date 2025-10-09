import java.util.*;
class Question22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }
}