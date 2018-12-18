package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class JLB7 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = String.valueOf(n).length();
        String [] s = Integer.toString(n).split("");
        int [] arr = new int[l];
        for (int i = 0; i < l; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        System.out.print("Sorted number in non-increasing order : ");
        int sum = 0;
        for (int i: arr) {
            System.out.print(i);
            if (i % 2 == 0) sum += i;
        }
        System.out.println("\n Sum of even numbers : " + sum);
        if (sum > 15) System.out.println("True");
        else System.out.println("False");

    }
}
