import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int array[]=new int[] {1,22,333,4444,55555,666666,7777777,88888888,999999999};
    for(int n=1;n<=t;n++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      for(int p=1;p<=y;p++)
      {
        for(int q=0;q<x;q++)
        {
          System.out.println(array[q]);
        }
        for(int r=x-2;r>=0;r--)
        {
          System.out.println(array[r]);
        }
        if(p<y)
          System.out.println();
      }
      if(n<t)
        System.out.println();
    }
  }
}
