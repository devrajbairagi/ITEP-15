import java.util.Scanner;
class Question15
{
   public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter cost price of a bike : ");
    int price = sc.nextInt();
    if(price>100000) System.out.println("15% Tax");
    else if(price > 50000 && price<=100000) System.out.println("10% Tax");
    else if(price <= 50000) System.out.println("5% Tax");
  }
}