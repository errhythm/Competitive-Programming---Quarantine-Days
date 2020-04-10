import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
{
        Scanner inp=new Scanner(System.in);
        while(inp.hasNextLong())
{
            long hasmit=inp.nextLong();
            long opp=inp.nextLong();
            long diff=Math.abs(opp-hasmit);
            System.out.println(diff);
        }
    }
}
