package Assignment1;

import java.util.Scanner;

public class JLB1 {
    public static void main(String [] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = n;
        int x = 0;

        while(n > 0){
            x = x * 10 + n % 10;
            n = n / 10;
        }
        int sum = 0;
        if(x == m){
            while(x > 0){
                n = x % 10;
                x = x / 10;
                if(n % 2 == 0) sum += n;
            }
        }
        else
            System.out.println(m + " is not palindrome");
        if(sum > 25) System.out.println(m + " is palindrome and sum is more than 25");
        else System.out.println(m + " is palindrome and sum is not more than 25");
    }
}
