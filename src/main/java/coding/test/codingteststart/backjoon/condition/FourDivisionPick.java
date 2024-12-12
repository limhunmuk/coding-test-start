package coding.test.codingteststart.backjoon.condition;

import java.util.Scanner;

public class FourDivisionPick {

    public int assertion(int a, int b){

        if(a > 0 && b > 0){
            return 1;
        }else if (a > 0 && b < 0){
            return 4;
        }else if (a < 0 && b > 0){
            return 2;
        }else{
            return 3;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        FourDivisionPick test = new FourDivisionPick();
        System.out.println(test.assertion(a, b));

    }
}
