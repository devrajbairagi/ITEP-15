import java.util.Scanner;
class Question1
{
   public static void main(String args[])
    {
        int length;
        int breadth;
       try (Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter a length");
           length = sc.nextInt();
           System.out.println("Enter a breadth");
           breadth = sc.nextInt();
       }
      if(length == breadth)
       System.out.println("This is square");
      else System.out.println("This is not square");
    }
}