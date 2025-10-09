import java.util.*;
class Question81 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i) + " " + Math.sqrt(i));
        }
    }
}