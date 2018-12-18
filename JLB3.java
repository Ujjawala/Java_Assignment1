package Assignment1;

import java.util.Scanner;

public class JLB3 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(Character.isLetter(s.charAt(i))){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    System.out.print(s.charAt(i) + "- Vowel");
                }
                else System.out.print(s.charAt(i) + "- Consonant");
            }
            else System.out.println(s.charAt(i) + "- Input is not a letter");
        }
    }
}