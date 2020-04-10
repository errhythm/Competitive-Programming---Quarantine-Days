import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    char $a = 'a';
    char $b = 'b';
    char $c = 'c';
    char $d = 'd';
    char $e = 'e';
    char $f = 'f';
    char $g = 'g';
    char $h = 'h';
    char $i = 'i';
    char $j = 'j';
    char $k = 'k';
    char $l = 'l';
    char $m = 'm';
    char $n = 'n';
    char $o = 'o';
    char $p = 'p';
    char $q = 'q';
    char $r = 'r';
    char $s = 's';
    char $t = 't';
    char $u = 'u';
    char $v = 'v';
    char $w = 'w';
    char $x = 'x';
    char $y = 'y';
    char $z = 'z';
    int $an =0;
    int $bn=0;
    int $cn=0;
    int $dn=0;
    int $en=0;
    int $fn=0;
    int $gn=0;
    int $hn=0;
    int $in=0;
    int $jn=0;
    int $kn=0;
    int $ln=0;
    int $mn=0;
    int $nn=0;
    int $on=0;
    int $pn=0;
    int $qn=0;
    int $rn=0;
    int $sn=0;
    int $tn=0;
    int $un=0;
    int $vn=0;
    int $wn=0;
    int $xn=0;
    int $yn=0;
    int $zn=0;
    int numsum;
    
    
    String someString;  
    Scanner sc = new Scanner(System.in);
    
    someString = sc.nextLine();
    for (int count = 0; count<someString.length(); count++)
    {
      if (someString.charAt(count) == $a) 
      {
        $an = 1;
      }
      if (someString.charAt(count) == $b) 
      {
        $bn = 1;
      }
      if (someString.charAt(count) == $c) 
      {
        $cn = 1;
      }
      if (someString.charAt(count) == $d) 
      {
        $dn = 1;
      }
      if (someString.charAt(count) == $e) 
      {
        $en = 1;
      }        
      if (someString.charAt(count) == $f) 
      {
        $fn = 1;
      } 
      if (someString.charAt(count) == $g) 
      {
        $gn = 1;
      }
      if (someString.charAt(count) == $h) 
      {
        $hn = 1;
      }
      if (someString.charAt(count) == $i) 
      {
        $in = 1;
      }
      if (someString.charAt(count) == $a) 
      {
        $an = 1;
      }
      if (someString.charAt(count) == $j) 
      {
        $jn = 1;
      }
      
      if (someString.charAt(count) == $k) 
      {
        $kn = 1;
      }
      if (someString.charAt(count) == $l) 
      {
        $ln = 1;
      }
      if (someString.charAt(count) == $m) 
      {
        $mn = 1;
      }
      if (someString.charAt(count) == $n) 
      {
        $nn = 1;
      }
      if (someString.charAt(count) == $o) 
      {
        $on = 1;
      }
      if (someString.charAt(count) == $p) 
      {
        $pn = 1;
      }
      if (someString.charAt(count) == $q) 
      {
        $qn = 1;
      }
      if (someString.charAt(count) == $r) 
      {
        $rn = 1;
      }
      if (someString.charAt(count) == $s) 
      {
        $sn = 1;
      }
      if (someString.charAt(count) == $t) 
      {
        $tn = 1;
      }
      if (someString.charAt(count) == $u) 
      {
        $un = 1;
      }
      if (someString.charAt(count) == $v) 
      {
        $vn = 1;
      }
      if (someString.charAt(count) == $w) 
      {
        $wn = 1;
      }
      if (someString.charAt(count) == $x) 
      {
        $xn = 1;
      }
      if (someString.charAt(count) == $y) 
      {
        $yn = 1;
      }
      if (someString.charAt(count) == $z) 
      {
        $zn = 1;
      }    
      
    }
    numsum = $an+$bn+$cn+$dn+$en+$fn+$gn+$hn+$in+$jn+$kn+$ln+$mn+$nn+$on+$pn+$qn+$rn+$sn+$tn+$un+$vn+$wn+$xn+$yn+$zn;
    if (numsum%2==0)
    {
      System.out.println("CHAT WITH HER!");
    }
    else 
    {
      System.out.println("IGNORE HIM!");
    }
  }
}
