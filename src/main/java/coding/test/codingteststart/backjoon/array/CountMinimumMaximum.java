package coding.test.codingteststart.backjoon.array;

import java.util.Scanner;

public class CountMinimumMaximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }


        System.out.println(min + " " + max);

        sc.close();
    }
}