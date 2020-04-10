import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double length = sc.nextInt();
    String n = null;    
    for(int i = 0; i <= length; i++)
    {
      n = sc.nextLine();      
      if(n.length() > 10)
      {
        System.out.print(n.charAt(0));
        System.out.print(n.length() -2); 
        System.out.print(n.charAt(n.length() -1));
        System.out.println("");
      }      
      else{
        System.out.println(n);
      }
    }
  }
}
