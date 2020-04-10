import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int x[] = new int [3];
    int temp=0;
    while(sc.hasNext())
    {      
      x[0] =sc.nextInt();
      x[1] =sc.nextInt();
      x[2] =sc.nextInt();
      if(x[0]==0 && x[1]==0 && x[2]==0)
      {
        break;
      }
      else 
      {
        for (int i = 0; i < x.length; i++) 
        {
          for (int j = i + 1; j < x.length; j++) 
          {
            if (x[i] > x[j]) 
            {
              temp = x[i];
              x[i] = x[j];
              x[j] = temp;
            }
          }
        }
        int rhs = x[2]*x[2];
        int lhs = (x[0]*x[0])+(x[1]*x[1]);
        if(rhs==lhs)
        {
          System.out.println("right");
        }
        else
        {
          System.out.println("wrong");
        }
      }
    }
  }
}
