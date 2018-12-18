package Assignment1;

import java.util.Scanner;

public class JLB6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        if(c >= 'a' && c <= 'z')
            System.out.println(c + " is Lower case letter.");
        else if (c >= 'A' && c <= 'Z')
            System.out.println(c + " is Upper case letter.");
        else if (Character.isDigit(c))
            System.out.println(c + " is Digit.");
        else System.out.println(c + " is Special Character.");
    }
}
