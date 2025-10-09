import java.util.Scanner;
class Question31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter choice (C/F): ");
        char ch=sc.next().charAt(0);
        if(ch=='C'||ch=='c'){
            System.out.print("Enter Fahrenheit: ");
            double f=sc.nextDouble();
            double c=(f-32)*5/9;
            System.out.println("Celsius: "+c);
        }else if(ch=='F'||ch=='f'){
            System.out.print("Enter Celsius: ");
            double c=sc.nextDouble();
            double f=(c*9/5)+32;
            System.out.println("Fahrenheit: "+f);
        }else System.out.println("Invalid choice");
    }
}