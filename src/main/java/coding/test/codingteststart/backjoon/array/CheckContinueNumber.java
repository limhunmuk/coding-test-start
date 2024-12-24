package coding.test.codingteststart.backjoon.array;

import java.util.Scanner;

public class CheckContinueNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int maxCnt = 10;
        for (int i = 0; i < 9; i++) {

            int input = sc.nextInt();
            if(input > max){
                max = input;
                maxCnt = i+1;
            }
        }

        System.out.println(max);
        System.out.println(maxCnt);
    }
}
