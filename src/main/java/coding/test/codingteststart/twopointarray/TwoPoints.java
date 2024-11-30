package coding.test.codingteststart.twopointarray;

import java.util.Scanner;

public class TwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("solution = " + solution(n));
    }

    public static int solution(int n){
        int answer = 0, sum=0, lt=0;
        int[] ch = new int[n];
        int m=n/2+1;
        for(int i=0; i<n; i++) ch[i]=i+1;
        for (int rt=0; rt<m; rt++){
            sum += ch[rt];
            if(sum == n) answer++;
            while(sum >= n){
                sum -= ch[lt++];
                if(sum == n) answer++;
            }
        }

        return answer;
    }
}
