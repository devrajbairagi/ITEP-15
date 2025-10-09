import java.util.*;
class Question9
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
double sum=0;
for(int i=1;i<=n;i++)
{
sum+=1.0/i;
}
System.out.println(sum);
}
}