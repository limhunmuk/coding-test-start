package coding.test.codingteststart.array;

import java.util.Scanner;

public class ThreeBoxMove {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       System.out.println("arr = " + solution(n, k, arr));

    }

    public static int solution(int n, int k, int[] box) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += box[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (box[i] - box[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
