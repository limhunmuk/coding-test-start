package coding.test.codingteststart.backjoon.textandstring;

import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String s1 = new StringBuffer(String.valueOf(a)).reverse().toString();
        String s2 = new StringBuffer(String.valueOf(b)).reverse().toString();

        if(Integer.parseInt(s1)>Integer.parseInt(s2)) System.out.println(Integer.parseInt(s1));
        else System.out.println(Integer.parseInt(s2));
    }
}
