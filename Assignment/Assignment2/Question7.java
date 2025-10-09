import java.util.Scanner;
class Question7
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the total number of classes held : ");
      int held = sc.nextInt();
      System.out.println("Enter the total number of classes attended : ");
      int attended = sc.nextInt();
      System.out.println(held);
      System.out.println(attended);
     float percentage = 0.0f;
     percentage = ((float)attended/held)*100;
      //System.out.println(percentage*100);
     String output = (percentage>75) ? "This student is allowed to sit in exam" : "This student not allowed to sit in exam";
     System.out.println(output);
   }
}