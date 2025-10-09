import java.util.*;
class Question49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int lcm = (a * b) / (new Question48Helper().hcf(a, b));
        System.out.println(lcm);
    }
}
class Question48Helper {
    int hcf(int a, int b) {
        int h = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) h = i;
        }
        return h;
    }
}