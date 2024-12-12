package coding.test.codingteststart.backjoon.loop;

import java.util.Scanner;

public class DerHagiCase2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for(int i=1; i<=count; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println("Case #"+(i)+": " + (first+second));
        }

        sc.close();
    }
}
