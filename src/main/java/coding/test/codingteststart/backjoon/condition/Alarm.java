package coding.test.codingteststart.backjoon.condition;

import java.util.Scanner;

public class Alarm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        minute = (minute - 45);
        if(minute < 0){
            minute = minute + 60;
            hour = hour - 1;
        }

        if(hour < 0){
            hour = hour + 23;
        }

        System.out.println(hour + " " + minute);
    }
}
