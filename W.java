import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        String[] val = new String[n];
        String a = "++X";
        String b = "X++";
        for(int i=0;i<n;i++)
        {
            String y = sc.next();
            val[i]=y;
        }
        for(int i=0;i<n;i++)
        {
          if(val[i].equals(a) || val[i].equals(b)){
                x++;
          }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
}
