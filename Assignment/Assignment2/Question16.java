import java.util.Scanner;
class Question16 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float pie = 3.14f;
        System.out.print("Enter radius of circle : ");
        int radius = sc.nextInt();
        float result= (float)(pie*radius*radius);
        System.out.print("area of circle is "+result);
    }
}
