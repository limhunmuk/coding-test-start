package coding.test.codingteststart.twopointarray;

import java.util.Scanner;

public class SequencePartCnt {

    public static void main(String[] args) {
        /**
         * 합이 6이 되는 경우의 수
         8 6
         1 2 1 3 1 1 1 2
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

       int cnt = solution(n, m, arr);
        System.out.println("cnt = " + cnt);
    }

    private static int solution(int n, int m, int[] arr) {
        int answer = 0, sum=0, lt=0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m) answer++;
            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }

        return answer;
    }
}
