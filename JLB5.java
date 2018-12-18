package Assignment1;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class JLB5
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.nextLine().split(" ");
        int c = 0, sum = 0;
        for (int i = 0; i < s.length; i++){
            if (StringUtils.isNumeric(s[i])){
                sum += Integer.parseInt(s[i]);
            }
            else c++;
        }
        System.out.println("Total no. of input = " + s.length);
        System.out.println("Sum of integer inputs = " + sum);
        System.out.println("Total no. of non-integer input = " + c);
    }
}
