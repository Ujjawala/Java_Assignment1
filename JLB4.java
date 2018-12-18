package Assignment1;

import java.util.*;

public class JLB4 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++)
                System.out.print(i);
        }
    }
}