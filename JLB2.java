package Assignment1;

import java.util.Scanner;

public class JLB2 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n >= 20 && n <= 30){
            if(n % 2 == 0){
                System.out.println("Jerry");
            }
            else System.out.println("Tom");
        }
        else System.out.println("Not in between 20 & 30");
    }
}