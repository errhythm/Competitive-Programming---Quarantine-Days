import java.util.Scanner;

public class Main
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  int sum = 0;
  int n = sc.nextInt();
  if (n >= 1){
   for (int i = 1;i <= n;i++)
    sum += i;
  }
   else{
   for (int i = n;i <= 1;i++)
    sum += i;
   }
  System.out.println(sum);
 }
}
