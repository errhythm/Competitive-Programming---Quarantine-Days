import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in); 
        int c=0;
    while(c==0){
    int a=sc.nextInt();
    int b=sc.nextInt();
    
      if(a < 0 || b < 0){
        break; 
      }
      else{
        if (a>b) {
          System.out.println(Math.min(a-b,100+b-a));
        } else if (a==b) {
          System.out.println(0);
        } else {
          System.out.println(Math.min(b-a,100+a-b));
        } 
      }
    }
  }
}
