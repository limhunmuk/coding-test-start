package coding.test.codingteststart.backjoon.array;

import java.util.*;

public class CountDivision42 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        SortedSet<Integer> dupSet = new TreeSet<>();
        SortedSet<Integer> result = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            dupSet.add(sc.nextInt());
        }

        for(Integer a : dupSet){
            //System.out.println("a = " + a%42);
            result.add(a%42);
        }

        System.out.println(result.size());


    }
}
