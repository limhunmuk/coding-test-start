package coding.test.codingteststart.backjoon.textandstring;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder reverse = new StringBuilder(s).reverse();
        if(s.contentEquals(reverse)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
