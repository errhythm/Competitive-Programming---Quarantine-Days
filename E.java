import java.util.Scanner;
public class Main{
 public static void main (String[] args){
{
  Scanner scan = new Scanner(System.in);
  while(scan.hasNext())
  {
   int previous = 0;
   int n = scan.nextInt();
   int current = scan.nextInt();
   boolean[] num = new boolean[n];
   n--;
   boolean isJolly;
   isJolly = true;
   
   while(n--!=0){
    previous = current;
    current = scan.nextInt();
    int diff = Math.abs(previous-current);
    if(diff == 0 || diff >= num.length || num[diff]){
      isJolly = false;
    }
    else{
      num[diff] = true;
    }
   }
   
   if(isJolly == true){
     System.out.println("Jolly");
   }
   else{
     System.out.println("Not jolly");
   }
  }
 }
 }
}
