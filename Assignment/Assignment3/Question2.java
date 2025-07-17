import java.util.Scanner;
class Question2
{
   public static void main(String args[])
  {
      int quantity;
      float temp;
       try (Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter Number of Quantity");
           quantity = sc.nextInt();
       }
   if(quantity > 1000) 
   {
     temp = quantity/10;
    // System.out.println("10% discount "+temp);
      temp = quantity-temp;
    System.out.println("Total cost with 10% discount "+temp*100);
    return;
   }
    System.out.println("Total cost "+quantity*100);
  }
}