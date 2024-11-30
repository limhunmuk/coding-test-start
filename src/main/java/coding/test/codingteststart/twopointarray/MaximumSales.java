package coding.test.codingteststart.twopointarray;

import java.util.Scanner;

public class MaximumSales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nemo = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        int maximum = solution(size, nemo, array);
        System.out.println("maximum = " + maximum);
    }

    public static int solution(int size, int nemo, int[] val){

        int answer = 0;
        for(int i=0; i<nemo; i++){
            answer += val[i];
        }
        System.out.println("answer = " + answer);
        System.out.println("size = " + val.length);

        int sum = answer;
        for(int i=nemo; i<val.length; i++){
            sum += val[i] - val[i-nemo];
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
