import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int count=1;
    int sum=0;
    
    
    while (count<=x) {
      
      
      
      int r =sc.nextInt();
      int s =sc.nextInt();
      sum=r+s;
      System.out.println("Case "+count+": "+sum);
      count++;
      
    }
  }
}

