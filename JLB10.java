package Assignment1;

import java.util.Scanner;

public class JLB10 {
    public static void main(String [] arg){
        Scanner scanner = new Scanner(System.in);
        StringBuilder st = new StringBuilder(scanner.nextLine());
        int n = scanner.nextInt();
        int l = st.length();
        int x = l - n;
        for (int i = 0; i < n; i++){
            st.append(st.substring(x,l));
        }
        System.out.println(st);
    }
}
