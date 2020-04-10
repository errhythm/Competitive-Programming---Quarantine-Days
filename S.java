import java.util.Scanner;
public class Main {
  public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);
    
        char[] key = new char[256];
        key['-'] = '-';
        key['0'] = '0';
        key['1'] = '1';
        key['A'] = '2';
        key['B'] = '2';
        key['C'] = '2';
        key['D'] = '3';
        key['E'] = '3';
        key['F'] = '3';
        key['G'] = '4';
        key['H'] = '4';
        key['I'] = '4';
        key['J'] = '5';
        key['K'] = '5';
        key['L'] = '5';
        key['M'] = '6';
        key['N'] = '6';
        key['O'] = '6';
        key['P'] = '7';
        key['Q'] = '7';
        key['R'] = '7';
        key['S'] = '7';
        key['T'] = '8';
        key['U'] = '8';
        key['V'] = '8';
        key['W'] = '9';
        key['X'] = '9';
        key['Y'] = '9';
        key['Z'] = '9';

        while (sc.hasNextLine()) {
            String exp = sc.nextLine();
            for (int i = 0; i < exp.length(); ++i)
                System.out.print(key[exp.charAt(i)]);
            System.out.println();
        }
    }
}
