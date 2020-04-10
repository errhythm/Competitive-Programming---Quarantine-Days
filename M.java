import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] l = text.toCharArray();
        l[0] = Character.toUpperCase(l[0]);
        for(int i=0; i<l.length; i++)
            System.out.print(l[i]);
    }
}
