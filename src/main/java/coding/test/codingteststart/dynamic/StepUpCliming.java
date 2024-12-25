package coding.test.codingteststart.dynamic;

import java.util.Scanner;

public class StepUpCliming {

    static int[] dy;
    public int solution(int n){
        dy[1]=1;
        dy[2]=2;
        for (int i=3; i<=n; i++){
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        StepUpCliming main = new StepUpCliming();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy=new int[n+1];
        System.out.println("main.solution(n) = " + main.solution(n));
    }
}
