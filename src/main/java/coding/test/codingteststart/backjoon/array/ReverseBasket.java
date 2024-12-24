package coding.test.codingteststart.backjoon.array;

import java.util.Scanner;

public class ReverseBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            int temp = 0;
            while (p1 < p2) {
                temp = basket[p1 - 1];
                basket[p1 - 1] = basket[p2 - 1];
                basket[p2 - 1] = temp;
                p1++;
                p2--;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }


    }
}
