import java.util.*;
class Question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = 0;
        int i = 1;
        while (cnt < n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                cnt++;
            }
            i++;
        }
    }
}