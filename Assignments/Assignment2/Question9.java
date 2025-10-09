import java.util.Scanner;
class Question9
{
   public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a character : ");
     char input = sc.next().charAt(0);
     if(Character.isUpperCase(input)) System.out.println("Uppercase letter");
     else System.out.println("Lowercase letter");
  }
}