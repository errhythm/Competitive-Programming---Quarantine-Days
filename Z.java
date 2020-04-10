import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
  int[] r = new int[60];
  int t = 1;
  int ok= 1;
  int n= 1;
  int ncase= 1;
  int[] a = new int[20];
  r[1] = 1;
  r[2] = 2;
  for(int i = 3; i < 55; i++) {
   r[i] = r[i - 1] + r[i - 2];
  }
  t = sc.nextInt();
  while(t-- != 0) {
   int count = 0;
   long sum = 1;
   n = sc.nextInt();
   for(int i = 0; i < n; ++i) {
    a[i] = sc.nextInt();
   }
   for(int i = 0; i < n; ++i) {
    count = ok = 0;
    int k = 0;
    for(int j = 1; j < 55; j++) {
     if(a[i] == r[j]) {
      ok = 2;
      break;
     }
     if(a[i] < r[j]) {
      ok = 1;
      k = j;
      break;
     }
    }
    if(ok == 1) {
     int x = a[i];
     while(x != 0) {
      while(r[k] > x) {
       k--;
      }
      x -= r[k];
      count++;
     }
    }
    if(ok != 2) {
     sum *= count;
    }
   }
   System.out.println("Case " + ncase++ + ": " + sum);
  }
 }
}
