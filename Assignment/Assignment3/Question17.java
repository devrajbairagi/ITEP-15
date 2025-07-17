import java.util.Scanner;
class Question17 {
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter breadtg of rectangle : ");
        int breadth = sc.nextInt();
        int result = length*breadth;
        System.out.println("area of rectangle is "+result);
   }    
}
