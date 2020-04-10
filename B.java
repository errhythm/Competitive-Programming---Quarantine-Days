import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while(num-- !=0){
			int a=in.nextInt(), b=in.nextInt();
    		if(a>b)
    			System.out.println(">");
    		if(a<b)
    			System.out.println("<");
    		if(a==b)
	  			System.out.println("=");
		}
	}
}
