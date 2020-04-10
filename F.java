import java.util.Scanner;
public class Main{
  public static void main (String[] args){
    {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 1;i <= t;i++)
      {
        int[] age = new int[12];
        int n = sc.nextInt();
        for (int j = 0;j < n;j++)
        {
          age[j] = sc.nextInt();
        }
        System.out.println("Case "+i+": "+age[n / 2]);
      }
    }
  }
}
