package coding.test.codingteststart.backjoon.loop;

import java.util.Scanner;

public class DerHagi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i=0; i<count; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println(first+second);
        }
    }
}
