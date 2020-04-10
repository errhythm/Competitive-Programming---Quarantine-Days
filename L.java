import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    
    int n1, n2,zero1,zero2,s1,s2;
    String str;
    Scanner sc=new Scanner(System.in);
    n1=sc.nextInt();
    n2=sc.nextInt();
    str=String.valueOf(n1);
    str=str.replaceAll("0",""); 
    zero1=Integer.parseInt(str); 
    str=String.valueOf(n2);
    str=str.replaceAll("0",""); 
    zero2=Integer.parseInt(str);
    s1 = zero1+zero2;
    s2 = n1+n2; 
    str=String.valueOf(s2);
    str=str.replaceAll("0",""); 
    s2=Integer.parseInt(str);
    if(s2==s1)
    {
      System.out.println("YES");
    }
    else
      System.out.println("NO");
  }  
}
