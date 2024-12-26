package coding.test.codingteststart.backjoon.textandstring;

import java.io.IOException;
import java.util.*;

public class AlphabetSearch {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String aa = "abcdefghijklmnopqrstuvwxyz";

        for(char c : aa.toCharArray()){
            if(input.contains(String.valueOf(c))) {
                System.out.print(input.indexOf(c) + " ");
            }else {
                System.out.print("-1 ");
            }
        }

        sc.close();
    }

}
