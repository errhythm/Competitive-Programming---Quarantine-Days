import java.util.Scanner;
public class Main {
  public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);
    
  int t=sc.nextInt();
  
  for (int n=0;n<t;n++) {
    
   int x=sc.nextInt();
   int y=sc.nextInt();
   int z=sc.nextInt();
   
   System.out.println(z*(x+(x-y))/(x+y));
  }
 }
}
