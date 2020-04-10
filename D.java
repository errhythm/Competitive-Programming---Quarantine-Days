import java.util.Scanner;

public class Main{
 public static void main (String[] args){
   Scanner sc = new Scanner(System.in); 
   int workers,x,y,z;  
           workers = sc.nextInt();  
           for(int i = 1; i < workers+1; i++) {  
                x = sc.nextInt();  
                y = sc.nextInt();  
                z = sc.nextInt();  
                System.out.print("Case " + i + ": ");  
                if (x > y) {  
                     if (y > z) {  
                          System.out.println(y);  
                          continue;  
                     }  
                     if (x > z) {  
                          System.out.println(z);  
                          continue;  
                     }  
                     System.out.println(x);  
                     continue;  
                }  
                if (x > z) {  
                     System.out.println(x);  
                     continue;  
                }  
                if (y > z) {  
                     System.out.println(z);  
                     continue;  
                }  
                System.out.println(y);  
                continue;  
           }  
      }  
 }  
