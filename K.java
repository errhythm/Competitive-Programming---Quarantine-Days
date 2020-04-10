import java.util.Scanner;
public class Main {
  public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);
    int v;
    int t;
    int s;
      
    while(sc.hasNext()){
      v = sc.nextInt();
      t = sc.nextInt();
      s = 2 * v * t;
      System.out.println(s);
    }
  }
}
