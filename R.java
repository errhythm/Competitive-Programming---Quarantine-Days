import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();
    
    while (t-- > 0){      
      int n = sc.nextInt();      
      n= (((((((n*567)/9)+7492)*235)/47)-498)/10);      
      int res = n%10;      
      System.out.println(Math.abs(res));      
    }
  }
}
