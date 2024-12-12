package coding.test.codingteststart.backjoon.condition;

import java.util.Scanner;

public class YoonYear {

    public static int chkYear(int year){

        // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(chkYear(a));
    }
}
