package coding.test.codingteststart.backjoon.array;

import java.util.Scanner;

public class GongInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];
        for (int i = 1; i <= M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();
            for (int j = start; j <= end; j++) {
                basket[j-1] = num;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i]);
            if(i != basket.length-1) sb.append(" ");
        }
        System.out.println(sb);
        sc.close();
    }
}
