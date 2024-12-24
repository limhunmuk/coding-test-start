package coding.test.codingteststart.backjoon.array;

import java.util.*;

public class CheckAttendance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<28; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        Arrays.sort(list.toArray());

        for (int i = 1; i < 31; i++) {
            if(!list.contains(i)){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
