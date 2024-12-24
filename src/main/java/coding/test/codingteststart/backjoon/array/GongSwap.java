package coding.test.codingteststart.backjoon.array;

import java.util.Scanner;

public class GongSwap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 바구니 갯수
        int M = sc.nextInt();   // 공을 빠꾸려는 횟수

        int[] basket = new int[N+1];

        for (int i=0; i<=N; i++) {
            basket[i] = i;
        }

        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = 0;

            tmp = basket[a];
            basket[a] = basket[b];
            basket[b] = tmp;
        }

        for(int i=1; i<=N; i++){
            System.out.print(basket[i] + " ");
        }

        sc.close();
    }
}
