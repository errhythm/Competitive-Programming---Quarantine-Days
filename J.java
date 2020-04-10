import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    int a;
    int b;
    int x;
    int y;
    n = sc.nextInt();
    while (n!=0){   
      a = sc.nextInt();
      b = sc.nextInt();
      while (n-- > 0){    
        x = sc.nextInt();
        y = sc.nextInt();
        if (x == a || y == b)
          System.out.println("divisa");
        else if (x < a && y > b)
          System.out.println("NO");
        else if (x > a && y > b)
          System.out.println("NE");
        else if (x > a && y < b)
          System.out.println("SE");
        else if (x < a && y < b)
          System.out.println("SO");
      }
      n = sc.nextInt();
    }
  }
}
