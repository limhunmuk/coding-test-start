package coding.test.codingteststart.backjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();
        double result = 0;
        for(int score : arr){

            double v = (double) score / max * 100;
            result += v;
        }

        System.out.println(result / cnt);
    }
}
